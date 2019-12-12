/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/notification_service.proto

package com.google.monitoring.v3;

public interface ListNotificationChannelDescriptorsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.ListNotificationChannelDescriptorsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The REST resource name of the parent from which to retrieve
   * the notification channel descriptors. The expected syntax is:
   *     projects/[PROJECT_ID]
   * Note that this names the parent container in which to look for the
   * descriptors; to retrieve a single descriptor by name, use the
   * [GetNotificationChannelDescriptor][google.monitoring.v3.NotificationChannelService.GetNotificationChannelDescriptor]
   * operation, instead.
   * </pre>
   *
   * <code>string name = 4;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The REST resource name of the parent from which to retrieve
   * the notification channel descriptors. The expected syntax is:
   *     projects/[PROJECT_ID]
   * Note that this names the parent container in which to look for the
   * descriptors; to retrieve a single descriptor by name, use the
   * [GetNotificationChannelDescriptor][google.monitoring.v3.NotificationChannelService.GetNotificationChannelDescriptor]
   * operation, instead.
   * </pre>
   *
   * <code>string name = 4;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The maximum number of results to return in a single response. If
   * not set to a positive number, a reasonable value will be chosen by the
   * service.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * If non-empty, `page_token` must contain a value returned as the
   * `next_page_token` in a previous response to request the next set
   * of results.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * If non-empty, `page_token` must contain a value returned as the
   * `next_page_token` in a previous response to request the next set
   * of results.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();
}
