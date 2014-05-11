/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.hadoop.hbase.consensus;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.hbase.ConsensusProvider;
import org.apache.hadoop.hbase.Server;

/**
 * Base class for {@link org.apache.hadoop.hbase.ConsensusProvider} implementations.
 * Defines methods to retrieve consensus objects for relevant areas. ConsensusProvider
 * reference returned from Server interface has to be casted to this type to
 * access those methods.
 */
@InterfaceAudience.Private
public abstract class BaseConsensusProvider implements ConsensusProvider {

  @Override
  public void initialize(Server server) {
  }

  @Override
  public void start() {
  }

  @Override
  public void stop() {
  }

  @Override
  public Server getServer() {
    return null;
  }
}
