## 1.8.0 [unreleased]

### Bug Fixes

1. [#108](https://github.com/influxdata/influxdb-client-java/pull/108): Fixed naming for Window function arguments - FluxDSL

## 1.7.0 [2020-04-17]

### Features
1. [#93](https://github.com/influxdata/influxdb-client-java/issues/93): Add addTags and addFields helper functions to Point
1. [#97](https://github.com/influxdata/influxdb-client-java/pull/97): Add the ability to specify the org and the bucket when creating the client

### Documentation
1. [#103](https://github.com/influxdata/influxdb-client-java/pull/103): Clarify how to use a client with InfluxDB 1.8

### Bug Fixes
1. [#98](https://github.com/influxdata/influxdb-client-java/issues/98): @Column supports super class inheritance for write measurements

## 1.6.0 [2020-03-13]

### Features
1. [#85](https://github.com/influxdata/influxdb-client-java/issues/85): Time field in Point supports BigInteger and BigDecimal
1. [#83](https://github.com/influxdata/influxdb-client-java/issues/83): Add reduce operator to FluxDSL
1. [#91](https://github.com/influxdata/influxdb-client-java/pull/91): Set User-Agent to influxdb-client-java/VERSION for all requests

### Bug Fixes
1. [#90](https://github.com/influxdata/influxdb-client-java/pull/90): Correctly parse CSV where multiple results include multiple tables
1. [#89](https://github.com/influxdata/influxdb-client-java/issues/89): @Column supports super class inheritance


## 1.5.0 [2020-02-14]

### Features
1. [#33](https://github.com/influxdata/influxdb-client-java/issues/33): InfluxDBClient.close also dispose a created writeApi
1. [#80](https://github.com/influxdata/influxdb-client-java/issues/80): FluxRecord, FluxColumn, FluxTable are serializable

### Bug Fixes
1. [#82](https://github.com/influxdata/influxdb-client-java/pull/82): Apply backpressure strategy when a buffer overflow

## 1.4.0 [2020-01-17]

### Features
1. [#76](https://github.com/influxdata/influxdb-client-java/pull/76): Added exists operator to Flux restrictions

### API
1. [#77](https://github.com/influxdata/influxdb-client-java/pull/77): Updated swagger to latest version

## 1.3.0 [2019-12-06]

### API
1. [#68](https://github.com/influxdata/influxdb-client-java/pull/68): Updated swagger to latest version

### Bug Fixes
1. [#69](https://github.com/influxdata/influxdb-client-java/issues/69): Fixed android compatibility

## 1.2.0 [2019-11-08]

### Features
1. [#66](https://github.com/influxdata/influxdb-client-java/pull/66): Added DeleteApi

### API
1. [#65](https://github.com/influxdata/influxdb-client-java/pull/65): Updated swagger to latest version

## 1.1.0 [2019-10-11]

### Features
1. [#59](https://github.com/influxdata/influxdb-client-java/issues/59): Added support for Monitoring & Alerting

### Improvements
1. [#60](https://github.com/influxdata/influxdb-client-java/pull/60): Writes performance optimized
1. [#61](https://github.com/influxdata/influxdb-client-java/pull/61): Use Try-With-Resources without catching clause

### API
1. [#58](https://github.com/influxdata/influxdb-client-java/pull/58): Updated swagger to latest version

### Bug Fixes
1. [#57](https://github.com/influxdata/influxdb-client-java/pull/57): LabelsApi: orgID parameter has to be pass as second argument

## 1.0.0 [2019-08-30]

### Features
1. [#50](https://github.com/influxdata/influxdb-client-java/issues/50): Added support for gzip compression of query response

### Bug Fixes
1. [#48](https://github.com/influxdata/influxdb-client-java/issues/48): The org parameter takes either the ID or Name interchangeably
1. [#53](https://github.com/influxdata/influxdb-client-java/issues/53): Drop NaN and infinity values from fields when writing to InfluxDB

### API
1. [#46](https://github.com/influxdata/influxdb-client-java/issues/46): Updated swagger to latest version

## 1.0.0.M2 [2019-08-01]

### Breaking Changes
1. [#40](https://github.com/influxdata/influxdb-client-java/issues/40): The client is hosted in Maven Central repository
    - Repackaged from `org.influxdata` to `com.influxdb`
    - Changed _groupId_ from `org.influxdata` to `com.influxdb`
    - Snapshots are located in the _OSS Snapshot repository_: `https://oss.sonatype.org/content/repositories/snapshots/`

### Features
1. [#34](https://github.com/influxdata/influxdb-client-java/issues/34): Auto-configure client from configuration file
1. [#35](https://github.com/influxdata/influxdb-client-java/issues/35): Possibility to specify default tags
1. [#41](https://github.com/influxdata/influxdb-client-java/issues/41): Synchronous blocking API to Write time-series data into InfluxDB 2.0

### Bug Fixes
1. [#43](https://github.com/influxdata/influxdb-client-java/issues/43): The data point without field should be ignored

### CI
1. [#37](https://github.com/influxdata/influxdb-client-java/issues/37): Switch CI from oraclejdk to openjdk 

## 1.0.0.M1

### Features
1. [client-java](https://github.com/influxdata/influxdb-client-java/tree/master/client#influxdb-client-java): The reference Java client that allows query, write and InfluxDB 2.0 management
1. [client-reactive](https://github.com/influxdata/influxdb-client-java/tree/master/client-reactive#influxdb-client-reactive): The reference RxJava client for the InfluxDB 2.0 that allows query and write in a reactive way
1. [client-kotlin](https://github.com/influxdata/influxdb-client-java/tree/master/client-kotlin#influxdb-client-kotlin): The reference Kotlin client that allows query and write for the InfluxDB 2.0 by Kotlin Channel coroutines
1. [client-scala](https://github.com/influxdata/influxdb-client-java/tree/master/client-scala#influxdb-client-scala): The reference Scala client that allows query and write for the InfluxDB 2.0 by Akka Streams
1. [client-legacy](https://github.com/influxdata/influxdb-client-java/tree/master/client-legacy#influxdb-client-flux):  The reference Java client that allows you to perform Flux queries against InfluxDB 1.7+
1. [flux-dsl](https://github.com/influxdata/influxdb-client-java/tree/master/flux-dsl#flux-dsl): A Java query builder for the Flux language
