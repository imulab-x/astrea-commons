package io.imulab.astrea.sdk.commons.flow.implicit;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.1)",
    comments = "Source: ImplicitFlowService.proto")
public final class ImplicitFlowServiceGrpc {

  private ImplicitFlowServiceGrpc() {}

  public static final String SERVICE_NAME = "flow.ImplicitFlowService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.imulab.astrea.sdk.commons.flow.implicit.ImplicitTokenRequest,
      io.imulab.astrea.sdk.commons.flow.implicit.ImplicitTokenResponse> getAuthorizeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Authorize",
      requestType = io.imulab.astrea.sdk.commons.flow.implicit.ImplicitTokenRequest.class,
      responseType = io.imulab.astrea.sdk.commons.flow.implicit.ImplicitTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.imulab.astrea.sdk.commons.flow.implicit.ImplicitTokenRequest,
      io.imulab.astrea.sdk.commons.flow.implicit.ImplicitTokenResponse> getAuthorizeMethod() {
    io.grpc.MethodDescriptor<io.imulab.astrea.sdk.commons.flow.implicit.ImplicitTokenRequest, io.imulab.astrea.sdk.commons.flow.implicit.ImplicitTokenResponse> getAuthorizeMethod;
    if ((getAuthorizeMethod = ImplicitFlowServiceGrpc.getAuthorizeMethod) == null) {
      synchronized (ImplicitFlowServiceGrpc.class) {
        if ((getAuthorizeMethod = ImplicitFlowServiceGrpc.getAuthorizeMethod) == null) {
          ImplicitFlowServiceGrpc.getAuthorizeMethod = getAuthorizeMethod = 
              io.grpc.MethodDescriptor.<io.imulab.astrea.sdk.commons.flow.implicit.ImplicitTokenRequest, io.imulab.astrea.sdk.commons.flow.implicit.ImplicitTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "flow.ImplicitFlowService", "Authorize"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.imulab.astrea.sdk.commons.flow.implicit.ImplicitTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.imulab.astrea.sdk.commons.flow.implicit.ImplicitTokenResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ImplicitFlowServiceMethodDescriptorSupplier("Authorize"))
                  .build();
          }
        }
     }
     return getAuthorizeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ImplicitFlowServiceStub newStub(io.grpc.Channel channel) {
    return new ImplicitFlowServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ImplicitFlowServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ImplicitFlowServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ImplicitFlowServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ImplicitFlowServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ImplicitFlowServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void authorize(io.imulab.astrea.sdk.commons.flow.implicit.ImplicitTokenRequest request,
        io.grpc.stub.StreamObserver<io.imulab.astrea.sdk.commons.flow.implicit.ImplicitTokenResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAuthorizeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAuthorizeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.imulab.astrea.sdk.commons.flow.implicit.ImplicitTokenRequest,
                io.imulab.astrea.sdk.commons.flow.implicit.ImplicitTokenResponse>(
                  this, METHODID_AUTHORIZE)))
          .build();
    }
  }

  /**
   */
  public static final class ImplicitFlowServiceStub extends io.grpc.stub.AbstractStub<ImplicitFlowServiceStub> {
    private ImplicitFlowServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ImplicitFlowServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImplicitFlowServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImplicitFlowServiceStub(channel, callOptions);
    }

    /**
     */
    public void authorize(io.imulab.astrea.sdk.commons.flow.implicit.ImplicitTokenRequest request,
        io.grpc.stub.StreamObserver<io.imulab.astrea.sdk.commons.flow.implicit.ImplicitTokenResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAuthorizeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ImplicitFlowServiceBlockingStub extends io.grpc.stub.AbstractStub<ImplicitFlowServiceBlockingStub> {
    private ImplicitFlowServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ImplicitFlowServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImplicitFlowServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImplicitFlowServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.imulab.astrea.sdk.commons.flow.implicit.ImplicitTokenResponse authorize(io.imulab.astrea.sdk.commons.flow.implicit.ImplicitTokenRequest request) {
      return blockingUnaryCall(
          getChannel(), getAuthorizeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ImplicitFlowServiceFutureStub extends io.grpc.stub.AbstractStub<ImplicitFlowServiceFutureStub> {
    private ImplicitFlowServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ImplicitFlowServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImplicitFlowServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImplicitFlowServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.imulab.astrea.sdk.commons.flow.implicit.ImplicitTokenResponse> authorize(
        io.imulab.astrea.sdk.commons.flow.implicit.ImplicitTokenRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAuthorizeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_AUTHORIZE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ImplicitFlowServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ImplicitFlowServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_AUTHORIZE:
          serviceImpl.authorize((io.imulab.astrea.sdk.commons.flow.implicit.ImplicitTokenRequest) request,
              (io.grpc.stub.StreamObserver<io.imulab.astrea.sdk.commons.flow.implicit.ImplicitTokenResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ImplicitFlowServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ImplicitFlowServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.imulab.astrea.sdk.commons.flow.implicit.ImplicitFlowServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ImplicitFlowService");
    }
  }

  private static final class ImplicitFlowServiceFileDescriptorSupplier
      extends ImplicitFlowServiceBaseDescriptorSupplier {
    ImplicitFlowServiceFileDescriptorSupplier() {}
  }

  private static final class ImplicitFlowServiceMethodDescriptorSupplier
      extends ImplicitFlowServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ImplicitFlowServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ImplicitFlowServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ImplicitFlowServiceFileDescriptorSupplier())
              .addMethod(getAuthorizeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
