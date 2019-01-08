package io.imulab.astrea.sdk.commons.flow.hybrid;

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
    comments = "Source: HybridFlowService.proto")
public final class HybridFlowServiceGrpc {

  private HybridFlowServiceGrpc() {}

  public static final String SERVICE_NAME = "flow.HybridFlowService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.imulab.astrea.sdk.commons.flow.hybrid.HybridCodeRequest,
      io.imulab.astrea.sdk.commons.flow.hybrid.HybridCodeResponse> getAuthorizeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Authorize",
      requestType = io.imulab.astrea.sdk.commons.flow.hybrid.HybridCodeRequest.class,
      responseType = io.imulab.astrea.sdk.commons.flow.hybrid.HybridCodeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.imulab.astrea.sdk.commons.flow.hybrid.HybridCodeRequest,
      io.imulab.astrea.sdk.commons.flow.hybrid.HybridCodeResponse> getAuthorizeMethod() {
    io.grpc.MethodDescriptor<io.imulab.astrea.sdk.commons.flow.hybrid.HybridCodeRequest, io.imulab.astrea.sdk.commons.flow.hybrid.HybridCodeResponse> getAuthorizeMethod;
    if ((getAuthorizeMethod = HybridFlowServiceGrpc.getAuthorizeMethod) == null) {
      synchronized (HybridFlowServiceGrpc.class) {
        if ((getAuthorizeMethod = HybridFlowServiceGrpc.getAuthorizeMethod) == null) {
          HybridFlowServiceGrpc.getAuthorizeMethod = getAuthorizeMethod = 
              io.grpc.MethodDescriptor.<io.imulab.astrea.sdk.commons.flow.hybrid.HybridCodeRequest, io.imulab.astrea.sdk.commons.flow.hybrid.HybridCodeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "flow.HybridFlowService", "Authorize"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.imulab.astrea.sdk.commons.flow.hybrid.HybridCodeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.imulab.astrea.sdk.commons.flow.hybrid.HybridCodeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HybridFlowServiceMethodDescriptorSupplier("Authorize"))
                  .build();
          }
        }
     }
     return getAuthorizeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.imulab.astrea.sdk.commons.flow.hybrid.HybridTokenRequest,
      io.imulab.astrea.sdk.commons.flow.hybrid.HybridTokenResponse> getExchangeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Exchange",
      requestType = io.imulab.astrea.sdk.commons.flow.hybrid.HybridTokenRequest.class,
      responseType = io.imulab.astrea.sdk.commons.flow.hybrid.HybridTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.imulab.astrea.sdk.commons.flow.hybrid.HybridTokenRequest,
      io.imulab.astrea.sdk.commons.flow.hybrid.HybridTokenResponse> getExchangeMethod() {
    io.grpc.MethodDescriptor<io.imulab.astrea.sdk.commons.flow.hybrid.HybridTokenRequest, io.imulab.astrea.sdk.commons.flow.hybrid.HybridTokenResponse> getExchangeMethod;
    if ((getExchangeMethod = HybridFlowServiceGrpc.getExchangeMethod) == null) {
      synchronized (HybridFlowServiceGrpc.class) {
        if ((getExchangeMethod = HybridFlowServiceGrpc.getExchangeMethod) == null) {
          HybridFlowServiceGrpc.getExchangeMethod = getExchangeMethod = 
              io.grpc.MethodDescriptor.<io.imulab.astrea.sdk.commons.flow.hybrid.HybridTokenRequest, io.imulab.astrea.sdk.commons.flow.hybrid.HybridTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "flow.HybridFlowService", "Exchange"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.imulab.astrea.sdk.commons.flow.hybrid.HybridTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.imulab.astrea.sdk.commons.flow.hybrid.HybridTokenResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HybridFlowServiceMethodDescriptorSupplier("Exchange"))
                  .build();
          }
        }
     }
     return getExchangeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HybridFlowServiceStub newStub(io.grpc.Channel channel) {
    return new HybridFlowServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HybridFlowServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HybridFlowServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HybridFlowServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HybridFlowServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class HybridFlowServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void authorize(io.imulab.astrea.sdk.commons.flow.hybrid.HybridCodeRequest request,
        io.grpc.stub.StreamObserver<io.imulab.astrea.sdk.commons.flow.hybrid.HybridCodeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAuthorizeMethod(), responseObserver);
    }

    /**
     */
    public void exchange(io.imulab.astrea.sdk.commons.flow.hybrid.HybridTokenRequest request,
        io.grpc.stub.StreamObserver<io.imulab.astrea.sdk.commons.flow.hybrid.HybridTokenResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getExchangeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAuthorizeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.imulab.astrea.sdk.commons.flow.hybrid.HybridCodeRequest,
                io.imulab.astrea.sdk.commons.flow.hybrid.HybridCodeResponse>(
                  this, METHODID_AUTHORIZE)))
          .addMethod(
            getExchangeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.imulab.astrea.sdk.commons.flow.hybrid.HybridTokenRequest,
                io.imulab.astrea.sdk.commons.flow.hybrid.HybridTokenResponse>(
                  this, METHODID_EXCHANGE)))
          .build();
    }
  }

  /**
   */
  public static final class HybridFlowServiceStub extends io.grpc.stub.AbstractStub<HybridFlowServiceStub> {
    private HybridFlowServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HybridFlowServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HybridFlowServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HybridFlowServiceStub(channel, callOptions);
    }

    /**
     */
    public void authorize(io.imulab.astrea.sdk.commons.flow.hybrid.HybridCodeRequest request,
        io.grpc.stub.StreamObserver<io.imulab.astrea.sdk.commons.flow.hybrid.HybridCodeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAuthorizeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void exchange(io.imulab.astrea.sdk.commons.flow.hybrid.HybridTokenRequest request,
        io.grpc.stub.StreamObserver<io.imulab.astrea.sdk.commons.flow.hybrid.HybridTokenResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getExchangeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HybridFlowServiceBlockingStub extends io.grpc.stub.AbstractStub<HybridFlowServiceBlockingStub> {
    private HybridFlowServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HybridFlowServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HybridFlowServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HybridFlowServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.imulab.astrea.sdk.commons.flow.hybrid.HybridCodeResponse authorize(io.imulab.astrea.sdk.commons.flow.hybrid.HybridCodeRequest request) {
      return blockingUnaryCall(
          getChannel(), getAuthorizeMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.imulab.astrea.sdk.commons.flow.hybrid.HybridTokenResponse exchange(io.imulab.astrea.sdk.commons.flow.hybrid.HybridTokenRequest request) {
      return blockingUnaryCall(
          getChannel(), getExchangeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HybridFlowServiceFutureStub extends io.grpc.stub.AbstractStub<HybridFlowServiceFutureStub> {
    private HybridFlowServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HybridFlowServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HybridFlowServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HybridFlowServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.imulab.astrea.sdk.commons.flow.hybrid.HybridCodeResponse> authorize(
        io.imulab.astrea.sdk.commons.flow.hybrid.HybridCodeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAuthorizeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.imulab.astrea.sdk.commons.flow.hybrid.HybridTokenResponse> exchange(
        io.imulab.astrea.sdk.commons.flow.hybrid.HybridTokenRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getExchangeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_AUTHORIZE = 0;
  private static final int METHODID_EXCHANGE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HybridFlowServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HybridFlowServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_AUTHORIZE:
          serviceImpl.authorize((io.imulab.astrea.sdk.commons.flow.hybrid.HybridCodeRequest) request,
              (io.grpc.stub.StreamObserver<io.imulab.astrea.sdk.commons.flow.hybrid.HybridCodeResponse>) responseObserver);
          break;
        case METHODID_EXCHANGE:
          serviceImpl.exchange((io.imulab.astrea.sdk.commons.flow.hybrid.HybridTokenRequest) request,
              (io.grpc.stub.StreamObserver<io.imulab.astrea.sdk.commons.flow.hybrid.HybridTokenResponse>) responseObserver);
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

  private static abstract class HybridFlowServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HybridFlowServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.imulab.astrea.sdk.commons.flow.hybrid.HybridFlowServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HybridFlowService");
    }
  }

  private static final class HybridFlowServiceFileDescriptorSupplier
      extends HybridFlowServiceBaseDescriptorSupplier {
    HybridFlowServiceFileDescriptorSupplier() {}
  }

  private static final class HybridFlowServiceMethodDescriptorSupplier
      extends HybridFlowServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HybridFlowServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (HybridFlowServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HybridFlowServiceFileDescriptorSupplier())
              .addMethod(getAuthorizeMethod())
              .addMethod(getExchangeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
