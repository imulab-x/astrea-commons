// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ImplicitFlowService.proto

package io.imulab.astrea.sdk.commons.flow.implicit;

public final class ImplicitFlowServiceProto {
  private ImplicitFlowServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_flow_ImplicitTokenRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_flow_ImplicitTokenRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_flow_ImplicitTokenRequest_Client_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_flow_ImplicitTokenRequest_Client_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_flow_ImplicitTokenRequest_Session_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_flow_ImplicitTokenRequest_Session_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_flow_ImplicitTokenResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_flow_ImplicitTokenResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_flow_ImplicitTokenResponse_Data_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_flow_ImplicitTokenResponse_Data_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031ImplicitFlowService.proto\022\004flow\032\rFailu" +
      "re.proto\"\371\004\n\024ImplicitTokenRequest\022\n\n\002id\030" +
      "\001 \001(\t\022\023\n\013requestTime\030\002 \001(\003\022\025\n\rresponseTy" +
      "pes\030\003 \003(\t\022\023\n\013redirectUri\030\004 \001(\t\022\r\n\005state\030" +
      "\005 \001(\t\022\016\n\006scopes\030\006 \003(\t\0221\n\006client\030\007 \001(\0132!." +
      "flow.ImplicitTokenRequest.Client\0223\n\007sess" +
      "ion\030\010 \001(\0132\".flow.ImplicitTokenRequest.Se" +
      "ssion\022\r\n\005nonce\030\t \001(\t\032\360\001\n\006Client\022\n\n\002id\030\001 " +
      "\001(\t\022\025\n\rresponseTypes\030\002 \003(\t\022\024\n\014redirectUr" +
      "is\030\003 \003(\t\022\016\n\006scopes\030\004 \003(\t\022\022\n\ngrantTypes\030\005" +
      " \003(\t\022&\n\036idTokenSignedResponseAlgorithm\030\006" +
      " \001(\t\022)\n!idTokenEncryptedResponseAlgorith" +
      "m\030\007 \001(\t\022(\n idTokenEncryptedResponseEncod" +
      "ing\030\010 \001(\t\022\014\n\004jwks\030\t \001(\t\032\212\001\n\007Session\022\017\n\007s" +
      "ubject\030\001 \001(\t\022\025\n\rgrantedScopes\030\002 \003(\t\022\032\n\022a" +
      "uthenticationTime\030\003 \001(\003\022\021\n\tacrValues\030\004 \003" +
      "(\t\022\r\n\005nonce\030\005 \001(\t\022\031\n\021obfuscatedSubject\030\006" +
      " \001(\t\"\347\001\n\025ImplicitTokenResponse\022\017\n\007succes" +
      "s\030\001 \001(\010\022.\n\004data\030\002 \001(\0132 .flow.ImplicitTok" +
      "enResponse.Data\022\034\n\007failure\030\003 \001(\0132\013.op.Fa" +
      "ilure\032o\n\004Data\022\023\n\013accessToken\030\001 \001(\t\022\021\n\tto" +
      "kenType\030\002 \001(\t\022\021\n\texpiresIn\030\003 \001(\003\022\017\n\007idTo" +
      "ken\030\004 \001(\t\022\016\n\006scopes\030\005 \003(\t\022\013\n\003foo\030\006 \001(\t2[" +
      "\n\023ImplicitFlowService\022D\n\tAuthorize\022\032.flo" +
      "w.ImplicitTokenRequest\032\033.flow.ImplicitTo" +
      "kenResponseBH\n*io.imulab.astrea.sdk.comm" +
      "ons.flow.implicitB\030ImplicitFlowServicePr" +
      "otoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.imulab.astrea.sdk.commons.op.FailureProto.getDescriptor(),
        }, assigner);
    internal_static_flow_ImplicitTokenRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_flow_ImplicitTokenRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_flow_ImplicitTokenRequest_descriptor,
        new java.lang.String[] { "Id", "RequestTime", "ResponseTypes", "RedirectUri", "State", "Scopes", "Client", "Session", "Nonce", });
    internal_static_flow_ImplicitTokenRequest_Client_descriptor =
      internal_static_flow_ImplicitTokenRequest_descriptor.getNestedTypes().get(0);
    internal_static_flow_ImplicitTokenRequest_Client_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_flow_ImplicitTokenRequest_Client_descriptor,
        new java.lang.String[] { "Id", "ResponseTypes", "RedirectUris", "Scopes", "GrantTypes", "IdTokenSignedResponseAlgorithm", "IdTokenEncryptedResponseAlgorithm", "IdTokenEncryptedResponseEncoding", "Jwks", });
    internal_static_flow_ImplicitTokenRequest_Session_descriptor =
      internal_static_flow_ImplicitTokenRequest_descriptor.getNestedTypes().get(1);
    internal_static_flow_ImplicitTokenRequest_Session_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_flow_ImplicitTokenRequest_Session_descriptor,
        new java.lang.String[] { "Subject", "GrantedScopes", "AuthenticationTime", "AcrValues", "Nonce", "ObfuscatedSubject", });
    internal_static_flow_ImplicitTokenResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_flow_ImplicitTokenResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_flow_ImplicitTokenResponse_descriptor,
        new java.lang.String[] { "Success", "Data", "Failure", });
    internal_static_flow_ImplicitTokenResponse_Data_descriptor =
      internal_static_flow_ImplicitTokenResponse_descriptor.getNestedTypes().get(0);
    internal_static_flow_ImplicitTokenResponse_Data_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_flow_ImplicitTokenResponse_Data_descriptor,
        new java.lang.String[] { "AccessToken", "TokenType", "ExpiresIn", "IdToken", "Scopes", "Foo", });
    io.imulab.astrea.sdk.commons.op.FailureProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
