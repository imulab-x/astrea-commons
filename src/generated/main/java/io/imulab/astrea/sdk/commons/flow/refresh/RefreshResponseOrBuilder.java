// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RefreshFlowService.proto

package io.imulab.astrea.sdk.commons.flow.refresh;

public interface RefreshResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:flow.RefreshResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool success = 1;</code>
   */
  boolean getSuccess();

  /**
   * <code>.flow.RefreshResponse.Data data = 2;</code>
   */
  boolean hasData();
  /**
   * <code>.flow.RefreshResponse.Data data = 2;</code>
   */
  io.imulab.astrea.sdk.commons.flow.refresh.RefreshResponse.Data getData();
  /**
   * <code>.flow.RefreshResponse.Data data = 2;</code>
   */
  io.imulab.astrea.sdk.commons.flow.refresh.RefreshResponse.DataOrBuilder getDataOrBuilder();

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
