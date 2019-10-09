#!/bin/sh

WORK_DIR=$(cd $(dirname $0); pwd)

cd $WORK_DIR

case "$1" in

  start)

    nohup ~/usr/bin/java -Xms2G -Xmx2G -Dlogback.loglevel=INFO -Djava.io.tmpdir=./tmp -jar hband-0.0.1-SNAPSHOT-exec.jar --server.contextPath=/umeox --spring.profiles.active=prod-china --server.port=8000 >/dev/null 2>&1 &
    echo $! > $WORK_DIR/server.pid
    ;;

  stop)
    kill `cat $WORK_DIR/server.pid`
    rm -rf $WORK_DIR/server.pid
    ;;

  restart)
    $0 stop
    sleep 1
    $0 start
    ;;

  *)
    echo "Usage: run.sh {start|stop|restart}"
    ;;

esac

exit 0
