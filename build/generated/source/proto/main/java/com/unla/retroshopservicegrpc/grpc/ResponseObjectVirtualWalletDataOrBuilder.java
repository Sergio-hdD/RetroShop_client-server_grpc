// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: retroShop_grpc.proto

package com.unla.retroshopservicegrpc.grpc;

public interface ResponseObjectVirtualWalletDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ResponseObjectVirtualWalletData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.VirtualWalletResponse virtualWalletResponse = 1;</code>
   * @return Whether the virtualWalletResponse field is set.
   */
  boolean hasVirtualWalletResponse();
  /**
   * <code>.VirtualWalletResponse virtualWalletResponse = 1;</code>
   * @return The virtualWalletResponse.
   */
  com.unla.retroshopservicegrpc.grpc.VirtualWalletResponse getVirtualWalletResponse();
  /**
   * <code>.VirtualWalletResponse virtualWalletResponse = 1;</code>
   */
  com.unla.retroshopservicegrpc.grpc.VirtualWalletResponseOrBuilder getVirtualWalletResponseOrBuilder();

  /**
   * <code>.TransactionMessage description = 2;</code>
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   * <code>.TransactionMessage description = 2;</code>
   * @return The description.
   */
  com.unla.retroshopservicegrpc.grpc.TransactionMessage getDescription();
  /**
   * <code>.TransactionMessage description = 2;</code>
   */
  com.unla.retroshopservicegrpc.grpc.TransactionMessageOrBuilder getDescriptionOrBuilder();
}
