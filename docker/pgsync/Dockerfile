FROM python:3.7
RUN pip install pgsync==2.1.1
ARG WORKDIR=/pgync
RUN mkdir $WORKDIR
ADD ./configs/ $WORKDIR/configs

WORKDIR $WORKDIR
COPY ./wait-for-it.sh wait-for-it.sh
COPY ./runserver.sh runserver.sh
RUN chmod +x wait-for-it.sh
RUN chmod +x runserver.sh
CMD ["./runserver.sh"]
