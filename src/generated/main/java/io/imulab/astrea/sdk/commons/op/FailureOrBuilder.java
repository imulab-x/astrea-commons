// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Failure.proto

package io.imulab.astrea.sdk.commons.op;

public interface FailureOrBuilder extends
    // @@protoc_insertion_point(interface_extends:op.Failure)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 status = 1;</code>
   */
  int getStatus();

  /**
   * <code>string error = 2;</code>
   */
  java.lang.String getError();
  /**
   * <code>string error = 2;</code>
   */
  com.google.protobuf.ByteString
      getErrorBytes();

  /**
   * <code>string description = 3;</code>
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 3;</code>
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>map&lt;string, string&gt; headers = 4;</code>
   */
  int getHeadersCount();
  /**
   * <code>map&lt;string, string&gt; headers = 4;</code>
   */
  boolean containsHeaders(
      java.lang.String key);
  /**
   * Use {@link #getHeadersMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getHeaders();
  /**
   * <code>map&lt;string, string&gt; headers = 4;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getHeadersMap();
  /**
   * <code>map&lt;string, string&gt; headers = 4;</code>
   */

  java.lang.String getHeadersOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; headers = 4;</code>
   */

  java.lang.String getHeadersOrThrow(
      java.lang.String key);
}
