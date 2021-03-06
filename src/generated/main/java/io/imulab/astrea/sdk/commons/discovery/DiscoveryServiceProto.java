// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DiscoveryService.proto

package io.imulab.astrea.sdk.commons.discovery;

public final class DiscoveryServiceProto {
  private DiscoveryServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_discovery_DiscoveryRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_discovery_DiscoveryRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_discovery_DiscoveryResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_discovery_DiscoveryResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026DiscoveryService.proto\022\tdiscovery\"\022\n\020D" +
      "iscoveryRequest\"\366\t\n\021DiscoveryResponse\022\016\n" +
      "\006issuer\030\001 \001(\t\022\035\n\025authorizationEndpoint\030\002" +
      " \001(\t\022\025\n\rtokenEndpoint\030\003 \001(\t\022\030\n\020userInfoE" +
      "ndpoint\030\004 \001(\t\022\017\n\007jwksUri\030\005 \001(\t\022\034\n\024regist" +
      "rationEndpoint\030\006 \001(\t\022\027\n\017scopesSupported\030" +
      "\007 \003(\t\022\036\n\026responseTypesSupported\030\010 \003(\t\022\035\n" +
      "\025responseModeSupported\030\t \003(\t\022\033\n\023grantTyp" +
      "esSupported\030\n \003(\t\022\032\n\022acrValuesSupported\030" +
      "\013 \003(\t\022\035\n\025subjectTypesSupported\030\014 \003(\t\022.\n&" +
      "idTokenSigningAlgorithmValuesSupported\030\r" +
      " \003(\t\0221\n)idTokenEncryptionAlgorithmValues" +
      "Supported\030\016 \003(\t\0220\n(idTokenEncryptionEnco" +
      "dingValuesSupported\030\017 \003(\t\022/\n\'userInfoSig" +
      "ningAlgorithmValuesSupported\030\020 \003(\t\0222\n*us" +
      "erInfoEncryptionAlgorithmValuesSupported" +
      "\030\021 \003(\t\0221\n)userInfoEncryptionEncodingValu" +
      "esSupported\030\022 \003(\t\0224\n,requestObjectSignin" +
      "gAlgorithmValuesSupported\030\023 \003(\t\0227\n/reque" +
      "stObjectEncryptionAlgorithmValuesSupport" +
      "ed\030\024 \003(\t\0226\n.requestObjectEncryptionEncod" +
      "ingValuesSupported\030\025 \003(\t\0223\n+tokenEndpoin" +
      "tAuthenticationMethodsSupported\030\026 \003(\t\022B\n" +
      ":tokenEndpointAuthenticationSigningAlgor" +
      "ithmValuesSupported\030\027 \003(\t\022\036\n\026displayValu" +
      "esSupported\030\030 \003(\t\022\033\n\023claimTypesSupported" +
      "\030\031 \003(\t\022\027\n\017claimsSupported\030\032 \003(\t\022\034\n\024servi" +
      "ceDocumentation\030\033 \001(\t\022\036\n\026claimsLocalesSu" +
      "pported\030\034 \003(\t\022\032\n\022uiLocalesSupported\030\035 \003(" +
      "\t\022 \n\030claimsParameterSupported\030\036 \001(\010\022!\n\031r" +
      "equestParameterSupported\030\037 \001(\010\022$\n\034reques" +
      "tUriParameterSupported\030  \001(\010\022%\n\035requireR" +
      "equestUriRegistration\030! \001(\010\022\023\n\013opPolicyU" +
      "ri\030\" \001(\t2M\n\tDiscovery\022@\n\003Get\022\033.discovery" +
      ".DiscoveryRequest\032\034.discovery.DiscoveryR" +
      "esponseBA\n&io.imulab.astrea.sdk.commons." +
      "discoveryB\025DiscoveryServiceProtoP\001b\006prot" +
      "o3"
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
        }, assigner);
    internal_static_discovery_DiscoveryRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_discovery_DiscoveryRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_discovery_DiscoveryRequest_descriptor,
        new java.lang.String[] { });
    internal_static_discovery_DiscoveryResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_discovery_DiscoveryResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_discovery_DiscoveryResponse_descriptor,
        new java.lang.String[] { "Issuer", "AuthorizationEndpoint", "TokenEndpoint", "UserInfoEndpoint", "JwksUri", "RegistrationEndpoint", "ScopesSupported", "ResponseTypesSupported", "ResponseModeSupported", "GrantTypesSupported", "AcrValuesSupported", "SubjectTypesSupported", "IdTokenSigningAlgorithmValuesSupported", "IdTokenEncryptionAlgorithmValuesSupported", "IdTokenEncryptionEncodingValuesSupported", "UserInfoSigningAlgorithmValuesSupported", "UserInfoEncryptionAlgorithmValuesSupported", "UserInfoEncryptionEncodingValuesSupported", "RequestObjectSigningAlgorithmValuesSupported", "RequestObjectEncryptionAlgorithmValuesSupported", "RequestObjectEncryptionEncodingValuesSupported", "TokenEndpointAuthenticationMethodsSupported", "TokenEndpointAuthenticationSigningAlgorithmValuesSupported", "DisplayValuesSupported", "ClaimTypesSupported", "ClaimsSupported", "ServiceDocumentation", "ClaimsLocalesSupported", "UiLocalesSupported", "ClaimsParameterSupported", "RequestParameterSupported", "RequestUriParameterSupported", "RequireRequestUriRegistration", "OpPolicyUri", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
