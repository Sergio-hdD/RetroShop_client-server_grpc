// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: retroShop_grpc.proto

package com.unla.retroshopservicegrpc.grpc;

/**
 * Protobuf type {@code DataToUpdateRequest}
 */
public final class DataToUpdateRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:DataToUpdateRequest)
    DataToUpdateRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DataToUpdateRequest.newBuilder() to construct.
  private DataToUpdateRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DataToUpdateRequest() {
    number_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DataToUpdateRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DataToUpdateRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            number_ = s;
            break;
          }
          case 16: {

            isMoneyIncome_ = input.readBool();
            break;
          }
          case 24: {

            value_ = input.readInt64();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.unla.retroshopservicegrpc.grpc.RetroShopGrpc.internal_static_DataToUpdateRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.unla.retroshopservicegrpc.grpc.RetroShopGrpc.internal_static_DataToUpdateRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.unla.retroshopservicegrpc.grpc.DataToUpdateRequest.class, com.unla.retroshopservicegrpc.grpc.DataToUpdateRequest.Builder.class);
  }

  public static final int NUMBER_FIELD_NUMBER = 1;
  private volatile java.lang.Object number_;
  /**
   * <code>string number = 1;</code>
   * @return The number.
   */
  @java.lang.Override
  public java.lang.String getNumber() {
    java.lang.Object ref = number_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      number_ = s;
      return s;
    }
  }
  /**
   * <code>string number = 1;</code>
   * @return The bytes for number.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNumberBytes() {
    java.lang.Object ref = number_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      number_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IS_MONEY_INCOME_FIELD_NUMBER = 2;
  private boolean isMoneyIncome_;
  /**
   * <code>bool is_money_income = 2;</code>
   * @return The isMoneyIncome.
   */
  @java.lang.Override
  public boolean getIsMoneyIncome() {
    return isMoneyIncome_;
  }

  public static final int VALUE_FIELD_NUMBER = 3;
  private long value_;
  /**
   * <code>int64 value = 3;</code>
   * @return The value.
   */
  @java.lang.Override
  public long getValue() {
    return value_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(number_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, number_);
    }
    if (isMoneyIncome_ != false) {
      output.writeBool(2, isMoneyIncome_);
    }
    if (value_ != 0L) {
      output.writeInt64(3, value_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(number_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, number_);
    }
    if (isMoneyIncome_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, isMoneyIncome_);
    }
    if (value_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, value_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.unla.retroshopservicegrpc.grpc.DataToUpdateRequest)) {
      return super.equals(obj);
    }
    com.unla.retroshopservicegrpc.grpc.DataToUpdateRequest other = (com.unla.retroshopservicegrpc.grpc.DataToUpdateRequest) obj;

    if (!getNumber()
        .equals(other.getNumber())) return false;
    if (getIsMoneyIncome()
        != other.getIsMoneyIncome()) return false;
    if (getValue()
        != other.getValue()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getNumber().hashCode();
    hash = (37 * hash) + IS_MONEY_INCOME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsMoneyIncome());
    hash = (37 * hash) + VALUE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getValue());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.unla.retroshopservicegrpc.grpc.DataToUpdateRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.unla.retroshopservicegrpc.grpc.DataToUpdateRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.unla.retroshopservicegrpc.grpc.DataToUpdateRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.unla.retroshopservicegrpc.grpc.DataToUpdateRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.unla.retroshopservicegrpc.grpc.DataToUpdateRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.unla.retroshopservicegrpc.grpc.DataToUpdateRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.unla.retroshopservicegrpc.grpc.DataToUpdateRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.unla.retroshopservicegrpc.grpc.DataToUpdateRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.unla.retroshopservicegrpc.grpc.DataToUpdateRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.unla.retroshopservicegrpc.grpc.DataToUpdateRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.unla.retroshopservicegrpc.grpc.DataToUpdateRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.unla.retroshopservicegrpc.grpc.DataToUpdateRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.unla.retroshopservicegrpc.grpc.DataToUpdateRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code DataToUpdateRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:DataToUpdateRequest)
      com.unla.retroshopservicegrpc.grpc.DataToUpdateRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.unla.retroshopservicegrpc.grpc.RetroShopGrpc.internal_static_DataToUpdateRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.unla.retroshopservicegrpc.grpc.RetroShopGrpc.internal_static_DataToUpdateRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.unla.retroshopservicegrpc.grpc.DataToUpdateRequest.class, com.unla.retroshopservicegrpc.grpc.DataToUpdateRequest.Builder.class);
    }

    // Construct using com.unla.retroshopservicegrpc.grpc.DataToUpdateRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      number_ = "";

      isMoneyIncome_ = false;

      value_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.unla.retroshopservicegrpc.grpc.RetroShopGrpc.internal_static_DataToUpdateRequest_descriptor;
    }

    @java.lang.Override
    public com.unla.retroshopservicegrpc.grpc.DataToUpdateRequest getDefaultInstanceForType() {
      return com.unla.retroshopservicegrpc.grpc.DataToUpdateRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.unla.retroshopservicegrpc.grpc.DataToUpdateRequest build() {
      com.unla.retroshopservicegrpc.grpc.DataToUpdateRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.unla.retroshopservicegrpc.grpc.DataToUpdateRequest buildPartial() {
      com.unla.retroshopservicegrpc.grpc.DataToUpdateRequest result = new com.unla.retroshopservicegrpc.grpc.DataToUpdateRequest(this);
      result.number_ = number_;
      result.isMoneyIncome_ = isMoneyIncome_;
      result.value_ = value_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.unla.retroshopservicegrpc.grpc.DataToUpdateRequest) {
        return mergeFrom((com.unla.retroshopservicegrpc.grpc.DataToUpdateRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.unla.retroshopservicegrpc.grpc.DataToUpdateRequest other) {
      if (other == com.unla.retroshopservicegrpc.grpc.DataToUpdateRequest.getDefaultInstance()) return this;
      if (!other.getNumber().isEmpty()) {
        number_ = other.number_;
        onChanged();
      }
      if (other.getIsMoneyIncome() != false) {
        setIsMoneyIncome(other.getIsMoneyIncome());
      }
      if (other.getValue() != 0L) {
        setValue(other.getValue());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.unla.retroshopservicegrpc.grpc.DataToUpdateRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.unla.retroshopservicegrpc.grpc.DataToUpdateRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object number_ = "";
    /**
     * <code>string number = 1;</code>
     * @return The number.
     */
    public java.lang.String getNumber() {
      java.lang.Object ref = number_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        number_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string number = 1;</code>
     * @return The bytes for number.
     */
    public com.google.protobuf.ByteString
        getNumberBytes() {
      java.lang.Object ref = number_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        number_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string number = 1;</code>
     * @param value The number to set.
     * @return This builder for chaining.
     */
    public Builder setNumber(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      number_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string number = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNumber() {
      
      number_ = getDefaultInstance().getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>string number = 1;</code>
     * @param value The bytes for number to set.
     * @return This builder for chaining.
     */
    public Builder setNumberBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      number_ = value;
      onChanged();
      return this;
    }

    private boolean isMoneyIncome_ ;
    /**
     * <code>bool is_money_income = 2;</code>
     * @return The isMoneyIncome.
     */
    @java.lang.Override
    public boolean getIsMoneyIncome() {
      return isMoneyIncome_;
    }
    /**
     * <code>bool is_money_income = 2;</code>
     * @param value The isMoneyIncome to set.
     * @return This builder for chaining.
     */
    public Builder setIsMoneyIncome(boolean value) {
      
      isMoneyIncome_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool is_money_income = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsMoneyIncome() {
      
      isMoneyIncome_ = false;
      onChanged();
      return this;
    }

    private long value_ ;
    /**
     * <code>int64 value = 3;</code>
     * @return The value.
     */
    @java.lang.Override
    public long getValue() {
      return value_;
    }
    /**
     * <code>int64 value = 3;</code>
     * @param value The value to set.
     * @return This builder for chaining.
     */
    public Builder setValue(long value) {
      
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 value = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearValue() {
      
      value_ = 0L;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:DataToUpdateRequest)
  }

  // @@protoc_insertion_point(class_scope:DataToUpdateRequest)
  private static final com.unla.retroshopservicegrpc.grpc.DataToUpdateRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.unla.retroshopservicegrpc.grpc.DataToUpdateRequest();
  }

  public static com.unla.retroshopservicegrpc.grpc.DataToUpdateRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DataToUpdateRequest>
      PARSER = new com.google.protobuf.AbstractParser<DataToUpdateRequest>() {
    @java.lang.Override
    public DataToUpdateRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DataToUpdateRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DataToUpdateRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DataToUpdateRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.unla.retroshopservicegrpc.grpc.DataToUpdateRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

