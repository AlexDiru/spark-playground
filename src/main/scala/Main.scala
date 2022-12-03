package com.alexdiru.sparkplayground

import org.apache.spark.sql.SparkSession

object Main {
  def main(args: Array[String]): Unit = {
    val logFile = "README.md"
    val spark = SparkSession.builder.appName("Simple Application").master("local").getOrCreate()
    val logData = spark.read.textFile(logFile).cache()
    val numAs = logData.filter(line => line.contains("a")).count()
    val numBs = logData.filter(line => line.contains("b")).count()
    println("----------------")
    println(s"Lines with a: $numAs, Lines with b: $numBs")
    println("----------------")
    spark.stop()
  }
}