package io.imulab.astrea.sdk.commons.flow.code;

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
    comments = "Source: AuthorizeCodeFlowService.proto")
public final class AuthorizeCodeFlowServiceGrpc {

  private AuthorizeCodeFlowServiceGrpc() {}

  public static final String SERVICE_NAME = "flow.AuthorizeCodeFlowService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.imulab.astrea.sdk.commons.flow.code.CodeRequest,
      io.imulab.astrea.sdk.commons.flow.code.CodeResponse> getAuthorizeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Authorize",
      requestType = io.imulab.astrea.sdk.commons.flow.code.CodeRequest.class,
      responseType = io.imulab.astrea.sdk.commons.flow.code.CodeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.imulab.astrea.sdk.commons.flow.code.CodeRequest,
      io.imulab.astrea.sdk.commons.flow.code.CodeResponse> getAuthorizeMethod() {
    io.grpc.MethodDescriptor<io.imulab.astrea.sdk.commons.flow.code.CodeRequest, io.imulab.astrea.sdk.commons.flow.code.CodeResponse> getAuthorizeMethod;
    if ((getAuthorizeMethod = AuthorizeCodeFlowServiceGrpc.getAuthorizeMethod) == null) {
      synchronized (AuthorizeCodeFlowServiceGrpc.class) {
        if ((getAuthorizeMethod = AuthorizeCodeFlowServiceGrpc.getAuthorizeMethod) == null) {
          AuthorizeCodeFlowServiceGrpc.getAuthorizeMethod = getAuthorizeMethod = 
              io.grpc.MethodDescriptor.<io.imulab.astrea.sdk.commons.flow.code.CodeRequest, io.imulab.astrea.sdk.commons.flow.code.CodeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "flow.AuthorizeCodeFlowService", "Authorize"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.imulab.astrea.sdk.commons.flow.code.CodeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.imulab.astrea.sdk.commons.flow.code.CodeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthorizeCodeFlowServiceMethodDescriptorSupplier("Authorize"))
                  .build();
          }
        }
     }
     return getAuthorizeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.imulab.astrea.sdk.commons.flow.code.TokenRequest,
      io.imulab.astrea.sdk.commons.flow.code.TokenResponse> getExchangeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Exchange",
      requestType = io.imulab.astrea.sdk.commons.flow.code.TokenRequest.class,
      responseType = io.imulab.astrea.sdk.commons.flow.code.TokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.imulab.astrea.sdk.commons.flow.code.TokenRequest,
      io.imulab.astrea.sdk.commons.flow.code.TokenResponse> getExchangeMethod() {
    io.grpc.MethodDescriptor<io.imulab.astrea.sdk.commons.flow.code.TokenRequest, io.imulab.astrea.sdk.commons.flow.code.TokenResponse> getExchangeMethod;
    if ((getExchangeMethod = AuthorizeCodeFlowServiceGrpc.getExchangeMethod) == null) {
      synchronized (AuthorizeCodeFlowServiceGrpc.class) {
        if ((getExchangeMethod = AuthorizeCodeFlowServiceGrpc.getExchangeMethod) == null) {
          AuthorizeCodeFlowServiceGrpc.getExchangeMethod = getExchangeMethod = 
              io.grpc.MethodDescriptor.<io.imulab.astrea.sdk.commons.flow.code.TokenRequest, io.imulab.astrea.sdk.commons.flow.code.TokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "flow.AuthorizeCodeFlowService", "Exchange"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.imulab.astrea.sdk.commons.flow.code.TokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.imulab.astrea.sdk.commons.flow.code.TokenResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthorizeCodeFlowServiceMethodDescriptorSupplier("Exchange"))
                  .build();
          }
        }
     }
     return getExchangeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AuthorizeCodeFlowServiceStub newStub(io.grpc.Channel channel) {
    return new AuthorizeCodeFlowServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AuthorizeCodeFlowServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AuthorizeCodeFlowServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AuthorizeCodeFlowServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AuthorizeCodeFlowServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class AuthorizeCodeFlowServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void authorize(io.imulab.astrea.sdk.commons.flow.code.CodeRequest request,
        io.grpc.stub.StreamObserver<io.imulab.astrea.sdk.commons.flow.code.CodeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAuthorizeMethod(), responseObserver);
    }

    /**
     */
    public void exchange(io.imulab.astrea.sdk.commons.flow.code.TokenRequest request,
        io.grpc.stub.StreamObserver<io.imulab.astrea.sdk.commons.flow.code.TokenResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getExchangeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAuthorizeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.imulab.astrea.sdk.commons.flow.code.CodeRequest,
                io.imulab.astrea.sdk.commons.flow.code.CodeResponse>(
                  this, METHODID_AUTHORIZE)))
          .addMethod(
            getExchangeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.imulab.astrea.sdk.commons.flow.code.TokenRequest,
                io.imulab.astrea.sdk.commons.flow.code.TokenResponse>(
                  this, METHODID_EXCHANGE)))
          .build();
    }
  }

  /**
   */
  public static final class AuthorizeCodeFlowServiceStub extends io.grpc.stub.AbstractStub<AuthorizeCodeFlowServiceStub> {
    private AuthorizeCodeFlowServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthorizeCodeFlowServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthorizeCodeFlowServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthorizeCodeFlowServiceStub(channel, callOptions);
    }

    /**
     */
    public void authorize(io.imulab.astrea.sdk.commons.flow.code.CodeRequest request,
        io.grpc.stub.StreamObserver<io.imulab.astrea.sdk.commons.flow.code.CodeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAuthorizeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void exchange(io.imulab.astrea.sdk.commons.flow.code.TokenRequest request,
        io.grpc.stub.StreamObserver<io.imulab.astrea.sdk.commons.flow.code.TokenResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getExchangeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AuthorizeCodeFlowServiceBlockingStub extends io.grpc.stub.AbstractStub<AuthorizeCodeFlowServiceBlockingStub> {
    private AuthorizeCodeFlowServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthorizeCodeFlowServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthorizeCodeFlowServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthorizeCodeFlowServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.imulab.astrea.sdk.commons.flow.code.CodeResponse authorize(io.imulab.astrea.sdk.commons.flow.code.CodeRequest request) {
      return blockingUnaryCall(
          getChannel(), getAuthorizeMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.imulab.astrea.sdk.commons.flow.code.TokenResponse exchange(io.imulab.astrea.sdk.commons.flow.code.TokenRequest request) {
      return blockingUnaryCall(
          getChannel(), getExchangeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AuthorizeCodeFlowServiceFutureStub extends io.grpc.stub.AbstractStub<AuthorizeCodeFlowServiceFutureStub> {
    private AuthorizeCodeFlowServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthorizeCodeFlowServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthorizeCodeFlowServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthorizeCodeFlowServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.imulab.astrea.sdk.commons.flow.code.CodeResponse> authorize(
        io.imulab.astrea.sdk.commons.flow.code.CodeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAuthorizeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.imulab.astrea.sdk.commons.flow.code.TokenResponse> exchange(
        io.imulab.astrea.sdk.commons.flow.code.TokenRequest request) {
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
    private final AuthorizeCodeFlowServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AuthorizeCodeFlowServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_AUTHORIZE:
          serviceImpl.authorize((io.imulab.astrea.sdk.commons.flow.code.CodeRequest) request,
              (io.grpc.stub.StreamObserver<io.imulab.astrea.sdk.commons.flow.code.CodeResponse>) responseObserver);
          break;
        case METHODID_EXCHANGE:
          serviceImpl.exchange((io.imulab.astrea.sdk.commons.flow.code.TokenRequest) request,
              (io.grpc.stub.StreamObserver<io.imulab.astrea.sdk.commons.flow.code.TokenResponse>) responseObserver);
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

  private static abstract class AuthorizeCodeFlowServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AuthorizeCodeFlowServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.imulab.astrea.sdk.commons.flow.code.AuthorizeCodeFlowServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AuthorizeCodeFlowService");
    }
  }

  private static final class AuthorizeCodeFlowServiceFileDescriptorSupplier
      extends AuthorizeCodeFlowServiceBaseDescriptorSupplier {
    AuthorizeCodeFlowServiceFileDescriptorSupplier() {}
  }

  private static final class AuthorizeCodeFlowServiceMethodDescriptorSupplier
      extends AuthorizeCodeFlowServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AuthorizeCodeFlowServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AuthorizeCodeFlowServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AuthorizeCodeFlowServiceFileDescriptorSupplier())
              .addMethod(getAuthorizeMethod())
              .addMethod(getExchangeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
