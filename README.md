# data-pipeline

Data pipeline implementing the following capabilities:

* Filtering
* Cleansingui
* Normalisation
* Data Enrichment
* Materialized Views builder
* Data flows management
* Alerting


This example launches:

- Orders Pipeline demo application using the Kafka Streams API.  This application demonstrates how to build of a simple music charts application.  It uses Kafka's
  [Interactive Queries](http://docs.confluent.io/current/streams/developer-guide.html#interactive-queries) feature to
  expose its latest processing results (e.g. latest Top 5 products sold) via a REST API.  Its input data is in Avro format,
  hence the use of Confluent Schema Registry (see below).
- a single-node Apache Kafka cluster with a single-node ZooKeeper ensemble
- a [Confluent Schema Registry](https://github.com/confluentinc/schema-registry) instance

The Order Pipeline application demonstrates how to build data pipeline applications application that continuously computes,
in real-time, the latest orders information.  It exposes its latest processing results -- the
latest charts -- via Kafka’s Interactive Queries feature and a REST API.  The application's input data is in Avro format
and comes from two sources: a stream of purchase orders (think: "the user X ordered the product Y") and a stream of user metadata ("user X
name is John").

More specifically, we will run the following services:

* Confluent's orders pipeline application
* a single-node Kafka cluster with a single-node ZooKeeper ensemble
* Confluent Schema Registry

