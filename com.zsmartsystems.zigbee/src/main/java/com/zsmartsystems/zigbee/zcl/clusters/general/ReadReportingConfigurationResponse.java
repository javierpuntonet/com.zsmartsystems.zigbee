/**
 * Copyright (c) 2016-2020 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.zcl.clusters.general;

import java.util.List;

import javax.annotation.Generated;

import com.zsmartsystems.zigbee.zcl.ZclCommand;
import com.zsmartsystems.zigbee.zcl.ZclFieldDeserializer;
import com.zsmartsystems.zigbee.zcl.ZclFieldSerializer;
import com.zsmartsystems.zigbee.zcl.field.AttributeReportingStatusRecord;
import com.zsmartsystems.zigbee.zcl.protocol.ZclCommandDirection;
import com.zsmartsystems.zigbee.zcl.protocol.ZclDataType;

/**
 * Read Reporting Configuration Response value object class.
 * <p>
 * Cluster: <b>General</b>. Command ID 0x09 is sent <b>TO</b> the server.
 * This command is a <b>generic</b> command used across the profile.
 * <p>
 * The Read Reporting Configuration Response command is used to respond to a Read Reporting
 * Configuration command.
 * <p>
 * Code is auto-generated. Modifications may be overwritten!
 */
@Generated(value = "com.zsmartsystems.zigbee.autocode.ZigBeeCodeGenerator", date = "2019-08-15T18:28:04Z")
public class ReadReportingConfigurationResponse extends ZclCommand {
    /**
     * The command ID.
     */
    public static int COMMAND_ID = 0x09;

    /**
     * Records command message field.
     */
    private List<AttributeReportingStatusRecord> records;

    /**
     * Default constructor.
     */
    public ReadReportingConfigurationResponse() {
        commandId = COMMAND_ID;
        genericCommand = true;
        commandDirection = ZclCommandDirection.CLIENT_TO_SERVER;
    }

    /**
     * Sets the cluster ID for <i>generic</i> commands. {@link ReadReportingConfigurationResponse} is a <i>generic</i> command.
     * <p>
     * For commands that are not <i>generic</i>, this method will do nothing as the cluster ID is fixed.
     * To test if a command is <i>generic</i>, use the {@link #isGenericCommand} method.
     *
     * @param clusterId the cluster ID used for <i>generic</i> commands as an {@link Integer}
     */
    @Override
    public void setClusterId(Integer clusterId) {
        this.clusterId = clusterId;
    }

    /**
     * Gets Records.
     *
     * @return the Records
     */
    public List<AttributeReportingStatusRecord> getRecords() {
        return records;
    }

    /**
     * Sets Records.
     *
     * @param records the Records
     */
    public void setRecords(final List<AttributeReportingStatusRecord> records) {
        this.records = records;
    }

    @Override
    public void serialize(final ZclFieldSerializer serializer) {
        serializer.serialize(records, ZclDataType.N_X_ATTRIBUTE_REPORTING_STATUS_RECORD);
    }

    @Override
    public void deserialize(final ZclFieldDeserializer deserializer) {
        records = (List<AttributeReportingStatusRecord>) deserializer.deserialize(ZclDataType.N_X_ATTRIBUTE_REPORTING_STATUS_RECORD);
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(64);
        builder.append("ReadReportingConfigurationResponse [");
        builder.append(super.toString());
        builder.append(", records=");
        builder.append(records);
        builder.append(']');
        return builder.toString();
    }

}
