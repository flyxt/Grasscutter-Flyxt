// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WorldPlayerLocationInfo.proto

package emu.grasscutter.net.proto;

public final class WorldPlayerLocationInfoOuterClass {
  private WorldPlayerLocationInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WorldPlayerLocationInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WorldPlayerLocationInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 sceneId = 1;</code>
     * @return The sceneId.
     */
    int getSceneId();

    /**
     * <code>.PlayerLocationInfo playerLoc = 2;</code>
     * @return Whether the playerLoc field is set.
     */
    boolean hasPlayerLoc();
    /**
     * <code>.PlayerLocationInfo playerLoc = 2;</code>
     * @return The playerLoc.
     */
    emu.grasscutter.net.proto.PlayerLocationInfoOuterClass.PlayerLocationInfo getPlayerLoc();
    /**
     * <code>.PlayerLocationInfo playerLoc = 2;</code>
     */
    emu.grasscutter.net.proto.PlayerLocationInfoOuterClass.PlayerLocationInfoOrBuilder getPlayerLocOrBuilder();
  }
  /**
   * Protobuf type {@code WorldPlayerLocationInfo}
   */
  public static final class WorldPlayerLocationInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:WorldPlayerLocationInfo)
      WorldPlayerLocationInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WorldPlayerLocationInfo.newBuilder() to construct.
    private WorldPlayerLocationInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WorldPlayerLocationInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WorldPlayerLocationInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private WorldPlayerLocationInfo(
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
            case 8: {

              sceneId_ = input.readUInt32();
              break;
            }
            case 18: {
              emu.grasscutter.net.proto.PlayerLocationInfoOuterClass.PlayerLocationInfo.Builder subBuilder = null;
              if (playerLoc_ != null) {
                subBuilder = playerLoc_.toBuilder();
              }
              playerLoc_ = input.readMessage(emu.grasscutter.net.proto.PlayerLocationInfoOuterClass.PlayerLocationInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(playerLoc_);
                playerLoc_ = subBuilder.buildPartial();
              }

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
      return emu.grasscutter.net.proto.WorldPlayerLocationInfoOuterClass.internal_static_WorldPlayerLocationInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.WorldPlayerLocationInfoOuterClass.internal_static_WorldPlayerLocationInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.WorldPlayerLocationInfoOuterClass.WorldPlayerLocationInfo.class, emu.grasscutter.net.proto.WorldPlayerLocationInfoOuterClass.WorldPlayerLocationInfo.Builder.class);
    }

    public static final int SCENEID_FIELD_NUMBER = 1;
    private int sceneId_;
    /**
     * <code>uint32 sceneId = 1;</code>
     * @return The sceneId.
     */
    @java.lang.Override
    public int getSceneId() {
      return sceneId_;
    }

    public static final int PLAYERLOC_FIELD_NUMBER = 2;
    private emu.grasscutter.net.proto.PlayerLocationInfoOuterClass.PlayerLocationInfo playerLoc_;
    /**
     * <code>.PlayerLocationInfo playerLoc = 2;</code>
     * @return Whether the playerLoc field is set.
     */
    @java.lang.Override
    public boolean hasPlayerLoc() {
      return playerLoc_ != null;
    }
    /**
     * <code>.PlayerLocationInfo playerLoc = 2;</code>
     * @return The playerLoc.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.PlayerLocationInfoOuterClass.PlayerLocationInfo getPlayerLoc() {
      return playerLoc_ == null ? emu.grasscutter.net.proto.PlayerLocationInfoOuterClass.PlayerLocationInfo.getDefaultInstance() : playerLoc_;
    }
    /**
     * <code>.PlayerLocationInfo playerLoc = 2;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.PlayerLocationInfoOuterClass.PlayerLocationInfoOrBuilder getPlayerLocOrBuilder() {
      return getPlayerLoc();
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
      if (sceneId_ != 0) {
        output.writeUInt32(1, sceneId_);
      }
      if (playerLoc_ != null) {
        output.writeMessage(2, getPlayerLoc());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (sceneId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, sceneId_);
      }
      if (playerLoc_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getPlayerLoc());
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
      if (!(obj instanceof emu.grasscutter.net.proto.WorldPlayerLocationInfoOuterClass.WorldPlayerLocationInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.WorldPlayerLocationInfoOuterClass.WorldPlayerLocationInfo other = (emu.grasscutter.net.proto.WorldPlayerLocationInfoOuterClass.WorldPlayerLocationInfo) obj;

      if (getSceneId()
          != other.getSceneId()) return false;
      if (hasPlayerLoc() != other.hasPlayerLoc()) return false;
      if (hasPlayerLoc()) {
        if (!getPlayerLoc()
            .equals(other.getPlayerLoc())) return false;
      }
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
      hash = (37 * hash) + SCENEID_FIELD_NUMBER;
      hash = (53 * hash) + getSceneId();
      if (hasPlayerLoc()) {
        hash = (37 * hash) + PLAYERLOC_FIELD_NUMBER;
        hash = (53 * hash) + getPlayerLoc().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.WorldPlayerLocationInfoOuterClass.WorldPlayerLocationInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WorldPlayerLocationInfoOuterClass.WorldPlayerLocationInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WorldPlayerLocationInfoOuterClass.WorldPlayerLocationInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WorldPlayerLocationInfoOuterClass.WorldPlayerLocationInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WorldPlayerLocationInfoOuterClass.WorldPlayerLocationInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WorldPlayerLocationInfoOuterClass.WorldPlayerLocationInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WorldPlayerLocationInfoOuterClass.WorldPlayerLocationInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WorldPlayerLocationInfoOuterClass.WorldPlayerLocationInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WorldPlayerLocationInfoOuterClass.WorldPlayerLocationInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WorldPlayerLocationInfoOuterClass.WorldPlayerLocationInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WorldPlayerLocationInfoOuterClass.WorldPlayerLocationInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WorldPlayerLocationInfoOuterClass.WorldPlayerLocationInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.WorldPlayerLocationInfoOuterClass.WorldPlayerLocationInfo prototype) {
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
     * Protobuf type {@code WorldPlayerLocationInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WorldPlayerLocationInfo)
        emu.grasscutter.net.proto.WorldPlayerLocationInfoOuterClass.WorldPlayerLocationInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.WorldPlayerLocationInfoOuterClass.internal_static_WorldPlayerLocationInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.WorldPlayerLocationInfoOuterClass.internal_static_WorldPlayerLocationInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.WorldPlayerLocationInfoOuterClass.WorldPlayerLocationInfo.class, emu.grasscutter.net.proto.WorldPlayerLocationInfoOuterClass.WorldPlayerLocationInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.WorldPlayerLocationInfoOuterClass.WorldPlayerLocationInfo.newBuilder()
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
        sceneId_ = 0;

        if (playerLocBuilder_ == null) {
          playerLoc_ = null;
        } else {
          playerLoc_ = null;
          playerLocBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.WorldPlayerLocationInfoOuterClass.internal_static_WorldPlayerLocationInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WorldPlayerLocationInfoOuterClass.WorldPlayerLocationInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.WorldPlayerLocationInfoOuterClass.WorldPlayerLocationInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WorldPlayerLocationInfoOuterClass.WorldPlayerLocationInfo build() {
        emu.grasscutter.net.proto.WorldPlayerLocationInfoOuterClass.WorldPlayerLocationInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WorldPlayerLocationInfoOuterClass.WorldPlayerLocationInfo buildPartial() {
        emu.grasscutter.net.proto.WorldPlayerLocationInfoOuterClass.WorldPlayerLocationInfo result = new emu.grasscutter.net.proto.WorldPlayerLocationInfoOuterClass.WorldPlayerLocationInfo(this);
        result.sceneId_ = sceneId_;
        if (playerLocBuilder_ == null) {
          result.playerLoc_ = playerLoc_;
        } else {
          result.playerLoc_ = playerLocBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.proto.WorldPlayerLocationInfoOuterClass.WorldPlayerLocationInfo) {
          return mergeFrom((emu.grasscutter.net.proto.WorldPlayerLocationInfoOuterClass.WorldPlayerLocationInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.WorldPlayerLocationInfoOuterClass.WorldPlayerLocationInfo other) {
        if (other == emu.grasscutter.net.proto.WorldPlayerLocationInfoOuterClass.WorldPlayerLocationInfo.getDefaultInstance()) return this;
        if (other.getSceneId() != 0) {
          setSceneId(other.getSceneId());
        }
        if (other.hasPlayerLoc()) {
          mergePlayerLoc(other.getPlayerLoc());
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
        emu.grasscutter.net.proto.WorldPlayerLocationInfoOuterClass.WorldPlayerLocationInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.WorldPlayerLocationInfoOuterClass.WorldPlayerLocationInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int sceneId_ ;
      /**
       * <code>uint32 sceneId = 1;</code>
       * @return The sceneId.
       */
      @java.lang.Override
      public int getSceneId() {
        return sceneId_;
      }
      /**
       * <code>uint32 sceneId = 1;</code>
       * @param value The sceneId to set.
       * @return This builder for chaining.
       */
      public Builder setSceneId(int value) {
        
        sceneId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 sceneId = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearSceneId() {
        
        sceneId_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.PlayerLocationInfoOuterClass.PlayerLocationInfo playerLoc_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.PlayerLocationInfoOuterClass.PlayerLocationInfo, emu.grasscutter.net.proto.PlayerLocationInfoOuterClass.PlayerLocationInfo.Builder, emu.grasscutter.net.proto.PlayerLocationInfoOuterClass.PlayerLocationInfoOrBuilder> playerLocBuilder_;
      /**
       * <code>.PlayerLocationInfo playerLoc = 2;</code>
       * @return Whether the playerLoc field is set.
       */
      public boolean hasPlayerLoc() {
        return playerLocBuilder_ != null || playerLoc_ != null;
      }
      /**
       * <code>.PlayerLocationInfo playerLoc = 2;</code>
       * @return The playerLoc.
       */
      public emu.grasscutter.net.proto.PlayerLocationInfoOuterClass.PlayerLocationInfo getPlayerLoc() {
        if (playerLocBuilder_ == null) {
          return playerLoc_ == null ? emu.grasscutter.net.proto.PlayerLocationInfoOuterClass.PlayerLocationInfo.getDefaultInstance() : playerLoc_;
        } else {
          return playerLocBuilder_.getMessage();
        }
      }
      /**
       * <code>.PlayerLocationInfo playerLoc = 2;</code>
       */
      public Builder setPlayerLoc(emu.grasscutter.net.proto.PlayerLocationInfoOuterClass.PlayerLocationInfo value) {
        if (playerLocBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          playerLoc_ = value;
          onChanged();
        } else {
          playerLocBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.PlayerLocationInfo playerLoc = 2;</code>
       */
      public Builder setPlayerLoc(
          emu.grasscutter.net.proto.PlayerLocationInfoOuterClass.PlayerLocationInfo.Builder builderForValue) {
        if (playerLocBuilder_ == null) {
          playerLoc_ = builderForValue.build();
          onChanged();
        } else {
          playerLocBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.PlayerLocationInfo playerLoc = 2;</code>
       */
      public Builder mergePlayerLoc(emu.grasscutter.net.proto.PlayerLocationInfoOuterClass.PlayerLocationInfo value) {
        if (playerLocBuilder_ == null) {
          if (playerLoc_ != null) {
            playerLoc_ =
              emu.grasscutter.net.proto.PlayerLocationInfoOuterClass.PlayerLocationInfo.newBuilder(playerLoc_).mergeFrom(value).buildPartial();
          } else {
            playerLoc_ = value;
          }
          onChanged();
        } else {
          playerLocBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.PlayerLocationInfo playerLoc = 2;</code>
       */
      public Builder clearPlayerLoc() {
        if (playerLocBuilder_ == null) {
          playerLoc_ = null;
          onChanged();
        } else {
          playerLoc_ = null;
          playerLocBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.PlayerLocationInfo playerLoc = 2;</code>
       */
      public emu.grasscutter.net.proto.PlayerLocationInfoOuterClass.PlayerLocationInfo.Builder getPlayerLocBuilder() {
        
        onChanged();
        return getPlayerLocFieldBuilder().getBuilder();
      }
      /**
       * <code>.PlayerLocationInfo playerLoc = 2;</code>
       */
      public emu.grasscutter.net.proto.PlayerLocationInfoOuterClass.PlayerLocationInfoOrBuilder getPlayerLocOrBuilder() {
        if (playerLocBuilder_ != null) {
          return playerLocBuilder_.getMessageOrBuilder();
        } else {
          return playerLoc_ == null ?
              emu.grasscutter.net.proto.PlayerLocationInfoOuterClass.PlayerLocationInfo.getDefaultInstance() : playerLoc_;
        }
      }
      /**
       * <code>.PlayerLocationInfo playerLoc = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.PlayerLocationInfoOuterClass.PlayerLocationInfo, emu.grasscutter.net.proto.PlayerLocationInfoOuterClass.PlayerLocationInfo.Builder, emu.grasscutter.net.proto.PlayerLocationInfoOuterClass.PlayerLocationInfoOrBuilder> 
          getPlayerLocFieldBuilder() {
        if (playerLocBuilder_ == null) {
          playerLocBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.PlayerLocationInfoOuterClass.PlayerLocationInfo, emu.grasscutter.net.proto.PlayerLocationInfoOuterClass.PlayerLocationInfo.Builder, emu.grasscutter.net.proto.PlayerLocationInfoOuterClass.PlayerLocationInfoOrBuilder>(
                  getPlayerLoc(),
                  getParentForChildren(),
                  isClean());
          playerLoc_ = null;
        }
        return playerLocBuilder_;
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


      // @@protoc_insertion_point(builder_scope:WorldPlayerLocationInfo)
    }

    // @@protoc_insertion_point(class_scope:WorldPlayerLocationInfo)
    private static final emu.grasscutter.net.proto.WorldPlayerLocationInfoOuterClass.WorldPlayerLocationInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.WorldPlayerLocationInfoOuterClass.WorldPlayerLocationInfo();
    }

    public static emu.grasscutter.net.proto.WorldPlayerLocationInfoOuterClass.WorldPlayerLocationInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WorldPlayerLocationInfo>
        PARSER = new com.google.protobuf.AbstractParser<WorldPlayerLocationInfo>() {
      @java.lang.Override
      public WorldPlayerLocationInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new WorldPlayerLocationInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<WorldPlayerLocationInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WorldPlayerLocationInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.WorldPlayerLocationInfoOuterClass.WorldPlayerLocationInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WorldPlayerLocationInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WorldPlayerLocationInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035WorldPlayerLocationInfo.proto\032\030PlayerL" +
      "ocationInfo.proto\"R\n\027WorldPlayerLocation" +
      "Info\022\017\n\007sceneId\030\001 \001(\r\022&\n\tplayerLoc\030\002 \001(\013" +
      "2\023.PlayerLocationInfoB\033\n\031emu.grasscutter" +
      ".net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.PlayerLocationInfoOuterClass.getDescriptor(),
        });
    internal_static_WorldPlayerLocationInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WorldPlayerLocationInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WorldPlayerLocationInfo_descriptor,
        new java.lang.String[] { "SceneId", "PlayerLoc", });
    emu.grasscutter.net.proto.PlayerLocationInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
