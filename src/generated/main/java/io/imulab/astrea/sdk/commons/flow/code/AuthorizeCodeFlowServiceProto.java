// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AuthorizeCodeFlowService.proto

package io.imulab.astrea.sdk.commons.flow.code;

public final class AuthorizeCodeFlowServiceProto {
  private AuthorizeCodeFlowServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_flow_CodeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_flow_CodeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_flow_CodeRequest_Client_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_flow_CodeRequest_Client_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_flow_CodeRequest_Session_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_flow_CodeRequest_Session_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_flow_CodeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_flow_CodeResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_flow_CodeResponse_Data_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_flow_CodeResponse_Data_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_flow_TokenRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_flow_TokenRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_flow_TokenRequest_Client_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_flow_TokenRequest_Client_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_flow_TokenResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_flow_TokenResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_flow_TokenResponse_Data_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_flow_TokenResponse_Data_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036AuthorizeCodeFlowService.proto\022\004flow\032\r" +
      "Failure.proto\"\257\003\n\013CodeRequest\022\n\n\002id\030\001 \001(" +
      "\t\022\023\n\013requestTime\030\002 \001(\003\022\025\n\rresponseTypes\030" +
      "\003 \003(\t\022\023\n\013redirectUri\030\004 \001(\t\022\r\n\005state\030\005 \001(" +
      "\t\022\016\n\006scopes\030\006 \003(\t\022(\n\006client\030\007 \001(\0132\030.flow" +
      ".CodeRequest.Client\022*\n\007session\030\010 \001(\0132\031.f" +
      "low.CodeRequest.Session\032Q\n\006Client\022\n\n\002id\030" +
      "\001 \001(\t\022\025\n\rresponseTypes\030\002 \003(\t\022\024\n\014redirect" +
      "Uris\030\003 \003(\t\022\016\n\006scopes\030\004 \003(\t\032\212\001\n\007Session\022\017" +
      "\n\007subject\030\001 \001(\t\022\025\n\rgrantedScopes\030\002 \003(\t\022\032" +
      "\n\022authenticationTime\030\003 \001(\003\022\021\n\tacrValues\030" +
      "\004 \003(\t\022\r\n\005nonce\030\005 \001(\t\022\031\n\021obfuscatedSubjec" +
      "t\030\006 \001(\t\"\212\001\n\014CodeResponse\022\017\n\007success\030\001 \001(" +
      "\010\022%\n\004data\030\002 \001(\0132\027.flow.CodeResponse.Data" +
      "\022\034\n\007failure\030\003 \001(\0132\013.op.Failure\032$\n\004Data\022\014" +
      "\n\004code\030\001 \001(\t\022\016\n\006scopes\030\002 \003(\t\"\216\003\n\014TokenRe" +
      "quest\022\n\n\002id\030\001 \001(\t\022\023\n\013requestTime\030\002 \001(\003\022\021" +
      "\n\tgrantType\030\003 \001(\t\022\014\n\004code\030\004 \001(\t\022\023\n\013redir" +
      "ectUri\030\005 \001(\t\022)\n\006client\030\006 \001(\0132\031.flow.Toke" +
      "nRequest.Client\032\373\001\n\006Client\022\n\n\002id\030\001 \001(\t\022\022" +
      "\n\ngrantTypes\030\002 \003(\t\022\024\n\014redirectUris\030\003 \003(\t" +
      "\022\014\n\004jwks\030\004 \001(\t\022\033\n\023sectorIdentifierUri\030\005 " +
      "\001(\t\022\023\n\013subjectType\030\006 \001(\t\022&\n\036idTokenSigne" +
      "dResponseAlgorithm\030\007 \001(\t\022)\n!idTokenEncry" +
      "ptedResponseAlgorithm\030\010 \001(\t\022(\n idTokenEn" +
      "cryptedResponseEncoding\030\t \001(\t\"\320\001\n\rTokenR" +
      "esponse\022\017\n\007success\030\001 \001(\010\022&\n\004data\030\002 \001(\0132\030" +
      ".flow.TokenResponse.Data\022\034\n\007failure\030\003 \001(" +
      "\0132\013.op.Failure\032h\n\004Data\022\023\n\013accessToken\030\001 " +
      "\001(\t\022\021\n\ttokenType\030\002 \001(\t\022\021\n\texpiresIn\030\003 \001(" +
      "\003\022\024\n\014refreshToken\030\004 \001(\t\022\017\n\007idToken\030\005 \001(\t" +
      "2\203\001\n\030AuthorizeCodeFlowService\0222\n\tAuthori" +
      "ze\022\021.flow.CodeRequest\032\022.flow.CodeRespons" +
      "e\0223\n\010Exchange\022\022.flow.TokenRequest\032\023.flow" +
      ".TokenResponseBI\n&io.imulab.astrea.sdk.c" +
      "ommons.flow.codeB\035AuthorizeCodeFlowServi" +
      "ceProtoP\001b\006proto3"
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
    internal_static_flow_CodeRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_flow_CodeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_flow_CodeRequest_descriptor,
        new java.lang.String[] { "Id", "RequestTime", "ResponseTypes", "RedirectUri", "State", "Scopes", "Client", "Session", });
    internal_static_flow_CodeRequest_Client_descriptor =
      internal_static_flow_CodeRequest_descriptor.getNestedTypes().get(0);
    internal_static_flow_CodeRequest_Client_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_flow_CodeRequest_Client_descriptor,
        new java.lang.String[] { "Id", "ResponseTypes", "RedirectUris", "Scopes", });
    internal_static_flow_CodeRequest_Session_descriptor =
      internal_static_flow_CodeRequest_descriptor.getNestedTypes().get(1);
    internal_static_flow_CodeRequest_Session_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_flow_CodeRequest_Session_descriptor,
        new java.lang.String[] { "Subject", "GrantedScopes", "AuthenticationTime", "AcrValues", "Nonce", "ObfuscatedSubject", });
    internal_static_flow_CodeResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_flow_CodeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_flow_CodeResponse_descriptor,
        new java.lang.String[] { "Success", "Data", "Failure", });
    internal_static_flow_CodeResponse_Data_descriptor =
      internal_static_flow_CodeResponse_descriptor.getNestedTypes().get(0);
    internal_static_flow_CodeResponse_Data_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_flow_CodeResponse_Data_descriptor,
        new java.lang.String[] { "Code", "Scopes", });
    internal_static_flow_TokenRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_flow_TokenRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_flow_TokenRequest_descriptor,
        new java.lang.String[] { "Id", "RequestTime", "GrantType", "Code", "RedirectUri", "Client", });
    internal_static_flow_TokenRequest_Client_descriptor =
      internal_static_flow_TokenRequest_descriptor.getNestedTypes().get(0);
    internal_static_flow_TokenRequest_Client_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_flow_TokenRequest_Client_descriptor,
        new java.lang.String[] { "Id", "GrantTypes", "RedirectUris", "Jwks", "SectorIdentifierUri", "SubjectType", "IdTokenSignedResponseAlgorithm", "IdTokenEncryptedResponseAlgorithm", "IdTokenEncryptedResponseEncoding", });
    internal_static_flow_TokenResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_flow_TokenResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_flow_TokenResponse_descriptor,
        new java.lang.String[] { "Success", "Data", "Failure", });
    internal_static_flow_TokenResponse_Data_descriptor =
      internal_static_flow_TokenResponse_descriptor.getNestedTypes().get(0);
    internal_static_flow_TokenResponse_Data_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_flow_TokenResponse_Data_descriptor,
        new java.lang.String[] { "AccessToken", "TokenType", "ExpiresIn", "RefreshToken", "IdToken", });
    io.imulab.astrea.sdk.commons.op.FailureProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
