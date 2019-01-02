package io.imulab.astrea.sdk.commons.flow.cc;

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
    comments = "Source: ClientCredentialsFlowService.proto")
public final class ClientCredentialsFlowServiceGrpc {

  private ClientCredentialsFlowServiceGrpc() {}

  public static final String SERVICE_NAME = "flow.ClientCredentialsFlowService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.imulab.astrea.sdk.commons.flow.cc.ClientCredentialsTokenRequest,
      io.imulab.astrea.sdk.commons.flow.cc.ClientCredentialsTokenResponse> getExchangeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "exchange",
      requestType = io.imulab.astrea.sdk.commons.flow.cc.ClientCredentialsTokenRequest.class,
      responseType = io.imulab.astrea.sdk.commons.flow.cc.ClientCredentialsTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.imulab.astrea.sdk.commons.flow.cc.ClientCredentialsTokenRequest,
      io.imulab.astrea.sdk.commons.flow.cc.ClientCredentialsTokenResponse> getExchangeMethod() {
    io.grpc.MethodDescriptor<io.imulab.astrea.sdk.commons.flow.cc.ClientCredentialsTokenRequest, io.imulab.astrea.sdk.commons.flow.cc.ClientCredentialsTokenResponse> getExchangeMethod;
    if ((getExchangeMethod = ClientCredentialsFlowServiceGrpc.getExchangeMethod) == null) {
      synchronized (ClientCredentialsFlowServiceGrpc.class) {
        if ((getExchangeMethod = ClientCredentialsFlowServiceGrpc.getExchangeMethod) == null) {
          ClientCredentialsFlowServiceGrpc.getExchangeMethod = getExchangeMethod = 
              io.grpc.MethodDescriptor.<io.imulab.astrea.sdk.commons.flow.cc.ClientCredentialsTokenRequest, io.imulab.astrea.sdk.commons.flow.cc.ClientCredentialsTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "flow.ClientCredentialsFlowService", "exchange"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.imulab.astrea.sdk.commons.flow.cc.ClientCredentialsTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.imulab.astrea.sdk.commons.flow.cc.ClientCredentialsTokenResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ClientCredentialsFlowServiceMethodDescriptorSupplier("exchange"))
                  .build();
          }
        }
     }
     return getExchangeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ClientCredentialsFlowServiceStub newStub(io.grpc.Channel channel) {
    return new ClientCredentialsFlowServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ClientCredentialsFlowServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ClientCredentialsFlowServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ClientCredentialsFlowServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ClientCredentialsFlowServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ClientCredentialsFlowServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void exchange(io.imulab.astrea.sdk.commons.flow.cc.ClientCredentialsTokenRequest request,
        io.grpc.stub.StreamObserver<io.imulab.astrea.sdk.commons.flow.cc.ClientCredentialsTokenResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getExchangeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getExchangeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.imulab.astrea.sdk.commons.flow.cc.ClientCredentialsTokenRequest,
                io.imulab.astrea.sdk.commons.flow.cc.ClientCredentialsTokenResponse>(
                  this, METHODID_EXCHANGE)))
          .build();
    }
  }

  /**
   */
  public static final class ClientCredentialsFlowServiceStub extends io.grpc.stub.AbstractStub<ClientCredentialsFlowServiceStub> {
    private ClientCredentialsFlowServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClientCredentialsFlowServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientCredentialsFlowServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClientCredentialsFlowServiceStub(channel, callOptions);
    }

    /**
     */
    public void exchange(io.imulab.astrea.sdk.commons.flow.cc.ClientCredentialsTokenRequest request,
        io.grpc.stub.StreamObserver<io.imulab.astrea.sdk.commons.flow.cc.ClientCredentialsTokenResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getExchangeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ClientCredentialsFlowServiceBlockingStub extends io.grpc.stub.AbstractStub<ClientCredentialsFlowServiceBlockingStub> {
    private ClientCredentialsFlowServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClientCredentialsFlowServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientCredentialsFlowServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClientCredentialsFlowServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.imulab.astrea.sdk.commons.flow.cc.ClientCredentialsTokenResponse exchange(io.imulab.astrea.sdk.commons.flow.cc.ClientCredentialsTokenRequest request) {
      return blockingUnaryCall(
          getChannel(), getExchangeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ClientCredentialsFlowServiceFutureStub extends io.grpc.stub.AbstractStub<ClientCredentialsFlowServiceFutureStub> {
    private ClientCredentialsFlowServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClientCredentialsFlowServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientCredentialsFlowServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClientCredentialsFlowServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.imulab.astrea.sdk.commons.flow.cc.ClientCredentialsTokenResponse> exchange(
        io.imulab.astrea.sdk.commons.flow.cc.ClientCredentialsTokenRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getExchangeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_EXCHANGE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ClientCredentialsFlowServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ClientCredentialsFlowServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_EXCHANGE:
          serviceImpl.exchange((io.imulab.astrea.sdk.commons.flow.cc.ClientCredentialsTokenRequest) request,
              (io.grpc.stub.StreamObserver<io.imulab.astrea.sdk.commons.flow.cc.ClientCredentialsTokenResponse>) responseObserver);
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

  private static abstract class ClientCredentialsFlowServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ClientCredentialsFlowServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.imulab.astrea.sdk.commons.flow.cc.ClientCredentialsFlowServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ClientCredentialsFlowService");
    }
  }

  private static final class ClientCredentialsFlowServiceFileDescriptorSupplier
      extends ClientCredentialsFlowServiceBaseDescriptorSupplier {
    ClientCredentialsFlowServiceFileDescriptorSupplier() {}
  }

  private static final class ClientCredentialsFlowServiceMethodDescriptorSupplier
      extends ClientCredentialsFlowServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ClientCredentialsFlowServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ClientCredentialsFlowServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ClientCredentialsFlowServiceFileDescriptorSupplier())
              .addMethod(getExchangeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
