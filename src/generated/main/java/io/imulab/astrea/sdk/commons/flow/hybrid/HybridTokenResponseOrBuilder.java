// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HybridFlowService.proto

package io.imulab.astrea.sdk.commons.flow.hybrid;

public interface HybridTokenResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:flow.HybridTokenResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool success = 1;</code>
   */
  boolean getSuccess();

  /**
   * <code>.flow.HybridTokenResponse.Data data = 2;</code>
   */
  boolean hasData();
  /**
   * <code>.flow.HybridTokenResponse.Data data = 2;</code>
   */
  io.imulab.astrea.sdk.commons.flow.hybrid.HybridTokenResponse.Data getData();
  /**
   * <code>.flow.HybridTokenResponse.Data data = 2;</code>
   */
  io.imulab.astrea.sdk.commons.flow.hybrid.HybridTokenResponse.DataOrBuilder getDataOrBuilder();

  /**
   * <code>.op.Failure failure = 3;</code>
   */
  boolean hasFailure();
  /**
   * <code>.op.Failure failure = 3;</code>
   */
  io.imulab.astrea.sdk.commons.op.Failure getFailure();
  /**
   * <code>.op.Failure failure = 3;</code>
   */
  io.imulab.astrea.sdk.commons.op.FailureOrBuilder getFailureOrBuilder();
}
