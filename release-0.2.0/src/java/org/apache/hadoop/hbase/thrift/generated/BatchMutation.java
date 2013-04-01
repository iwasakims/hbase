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
 
/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.apache.hadoop.hbase.thrift.generated;

import java.util.ArrayList;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.HashSet;
import com.facebook.thrift.*;

import com.facebook.thrift.protocol.*;
import com.facebook.thrift.transport.*;

/**
 * A BatchMutation object is used to apply a number of Mutations to a single row.
 */
public class BatchMutation implements TBase, java.io.Serializable {
  public byte[] row;
  public ArrayList<Mutation> mutations;

  public final Isset __isset = new Isset();
  public static final class Isset {
    public boolean row = false;
    public boolean mutations = false;
  }

  public BatchMutation() {
  }

  public BatchMutation(
    byte[] row,
    ArrayList<Mutation> mutations)
  {
    this();
    this.row = row;
    this.__isset.row = true;
    this.mutations = mutations;
    this.__isset.mutations = true;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id)
      {
        case 1:
          if (field.type == TType.STRING) {
            this.row = iprot.readBinary();
            this.__isset.row = true;
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2:
          if (field.type == TType.LIST) {
            {
              TList _list0 = iprot.readListBegin();
              this.mutations = new ArrayList<Mutation>(_list0.size);
              for (int _i1 = 0; _i1 < _list0.size; ++_i1)
              {
                Mutation _elem2 = new Mutation();
                _elem2 = new Mutation();
                _elem2.read(iprot);
                this.mutations.add(_elem2);
              }
              iprot.readListEnd();
            }
            this.__isset.mutations = true;
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();
  }

  public void write(TProtocol oprot) throws TException {
    TStruct struct = new TStruct("BatchMutation");
    oprot.writeStructBegin(struct);
    TField field = new TField();
    if (this.row != null) {
      field.name = "row";
      field.type = TType.STRING;
      field.id = 1;
      oprot.writeFieldBegin(field);
      oprot.writeBinary(this.row);
      oprot.writeFieldEnd();
    }
    if (this.mutations != null) {
      field.name = "mutations";
      field.type = TType.LIST;
      field.id = 2;
      oprot.writeFieldBegin(field);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.mutations.size()));
        for (Mutation _iter3 : this.mutations)        {
          _iter3.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuilder sb = new StringBuilder("BatchMutation(");
    sb.append("row:");
    sb.append(this.row);
    sb.append(",mutations:");
    sb.append(this.mutations);
    sb.append(")");
    return sb.toString();
  }

}
