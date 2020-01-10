/**
 * Copyright (c) 2016-2020 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.zcl.clusters.metering;

import javax.annotation.Generated;

import com.zsmartsystems.zigbee.zcl.ZclFieldDeserializer;
import com.zsmartsystems.zigbee.zcl.ZclFieldSerializer;
import com.zsmartsystems.zigbee.zcl.protocol.ZclCommandDirection;
import com.zsmartsystems.zigbee.zcl.protocol.ZclDataType;

/**
 * Set Supply Status value object class.
 * <p>
 * Cluster: <b>Metering</b>. Command ID 0x0D is sent <b>TO</b> the server.
 * This command is a <b>specific</b> command used for the Metering cluster.
 * <p>
 * This command is used to specify the required status of the supply following the occurance of
 * certain events on the meter.
 * <p>
 * Code is auto-generated. Modifications may be overwritten!
 */
@Generated(value = "com.zsmartsystems.zigbee.autocode.ZigBeeCodeGenerator", date = "2020-01-10T12:07:00Z")
public class SetSupplyStatus extends ZclMeteringCommand {
    /**
     * The cluster ID to which this command belongs.
     */
    public static int CLUSTER_ID = 0x0702;

    /**
     * The command ID.
     */
    public static int COMMAND_ID = 0x0D;

    /**
     * Issuer Event ID command message field.
     * <p>
     * Unique identifier generated by the commodity provider. When new information is
     * provided that replaces older information for the same time period, this field allows
     * devices to determine which information is newer. The value contained in this field is a
     * unique number managed by upstream servers or a UTC based time stamp (UTCTime data type)
     * identifying when the command was issued. Thus, newer information will have a value in
     * the Issuer Event ID field that is larger than older information.
     */
    private Integer issuerEventId;

    /**
     * Supply Tamper State command message field.
     * <p>
     * The SupplyTamperState indicates the required status of the supply following the
     * detection of a tamper event within the metering device.
     */
    private Integer supplyTamperState;

    /**
     * Supply Depletion State command message field.
     * <p>
     * The SupplyDepletionState indicates the required status of the supply following
     * detection of a depleted battery within the metering device.
     */
    private Integer supplyDepletionState;

    /**
     * Supply Uncontrolled Flow State command message field.
     * <p>
     * The SupplyUncontrolledFlowState indicates the required status of the supply
     * following detection of an uncontrolled flow event within the metering device.
     */
    private Integer supplyUncontrolledFlowState;

    /**
     * Load Limit Supply State command message field.
     * <p>
     * The LoadLimitSupplyState indicates the required status of the supply once the device
     * is in a load limit state.
     */
    private Integer loadLimitSupplyState;

    /**
     * Default constructor.
     */
    public SetSupplyStatus() {
        clusterId = CLUSTER_ID;
        commandId = COMMAND_ID;
        genericCommand = false;
        commandDirection = ZclCommandDirection.CLIENT_TO_SERVER;
    }

    /**
     * Gets Issuer Event ID.
     * <p>
     * Unique identifier generated by the commodity provider. When new information is
     * provided that replaces older information for the same time period, this field allows
     * devices to determine which information is newer. The value contained in this field is a
     * unique number managed by upstream servers or a UTC based time stamp (UTCTime data type)
     * identifying when the command was issued. Thus, newer information will have a value in
     * the Issuer Event ID field that is larger than older information.
     *
     * @return the Issuer Event ID
     */
    public Integer getIssuerEventId() {
        return issuerEventId;
    }

    /**
     * Sets Issuer Event ID.
     * <p>
     * Unique identifier generated by the commodity provider. When new information is
     * provided that replaces older information for the same time period, this field allows
     * devices to determine which information is newer. The value contained in this field is a
     * unique number managed by upstream servers or a UTC based time stamp (UTCTime data type)
     * identifying when the command was issued. Thus, newer information will have a value in
     * the Issuer Event ID field that is larger than older information.
     *
     * @param issuerEventId the Issuer Event ID
     */
    public void setIssuerEventId(final Integer issuerEventId) {
        this.issuerEventId = issuerEventId;
    }

    /**
     * Gets Supply Tamper State.
     * <p>
     * The SupplyTamperState indicates the required status of the supply following the
     * detection of a tamper event within the metering device.
     *
     * @return the Supply Tamper State
     */
    public Integer getSupplyTamperState() {
        return supplyTamperState;
    }

    /**
     * Sets Supply Tamper State.
     * <p>
     * The SupplyTamperState indicates the required status of the supply following the
     * detection of a tamper event within the metering device.
     *
     * @param supplyTamperState the Supply Tamper State
     */
    public void setSupplyTamperState(final Integer supplyTamperState) {
        this.supplyTamperState = supplyTamperState;
    }

    /**
     * Gets Supply Depletion State.
     * <p>
     * The SupplyDepletionState indicates the required status of the supply following
     * detection of a depleted battery within the metering device.
     *
     * @return the Supply Depletion State
     */
    public Integer getSupplyDepletionState() {
        return supplyDepletionState;
    }

    /**
     * Sets Supply Depletion State.
     * <p>
     * The SupplyDepletionState indicates the required status of the supply following
     * detection of a depleted battery within the metering device.
     *
     * @param supplyDepletionState the Supply Depletion State
     */
    public void setSupplyDepletionState(final Integer supplyDepletionState) {
        this.supplyDepletionState = supplyDepletionState;
    }

    /**
     * Gets Supply Uncontrolled Flow State.
     * <p>
     * The SupplyUncontrolledFlowState indicates the required status of the supply
     * following detection of an uncontrolled flow event within the metering device.
     *
     * @return the Supply Uncontrolled Flow State
     */
    public Integer getSupplyUncontrolledFlowState() {
        return supplyUncontrolledFlowState;
    }

    /**
     * Sets Supply Uncontrolled Flow State.
     * <p>
     * The SupplyUncontrolledFlowState indicates the required status of the supply
     * following detection of an uncontrolled flow event within the metering device.
     *
     * @param supplyUncontrolledFlowState the Supply Uncontrolled Flow State
     */
    public void setSupplyUncontrolledFlowState(final Integer supplyUncontrolledFlowState) {
        this.supplyUncontrolledFlowState = supplyUncontrolledFlowState;
    }

    /**
     * Gets Load Limit Supply State.
     * <p>
     * The LoadLimitSupplyState indicates the required status of the supply once the device
     * is in a load limit state.
     *
     * @return the Load Limit Supply State
     */
    public Integer getLoadLimitSupplyState() {
        return loadLimitSupplyState;
    }

    /**
     * Sets Load Limit Supply State.
     * <p>
     * The LoadLimitSupplyState indicates the required status of the supply once the device
     * is in a load limit state.
     *
     * @param loadLimitSupplyState the Load Limit Supply State
     */
    public void setLoadLimitSupplyState(final Integer loadLimitSupplyState) {
        this.loadLimitSupplyState = loadLimitSupplyState;
    }

    @Override
    public void serialize(final ZclFieldSerializer serializer) {
        serializer.serialize(issuerEventId, ZclDataType.UNSIGNED_32_BIT_INTEGER);
        serializer.serialize(supplyTamperState, ZclDataType.ENUMERATION_8_BIT);
        serializer.serialize(supplyDepletionState, ZclDataType.ENUMERATION_8_BIT);
        serializer.serialize(supplyUncontrolledFlowState, ZclDataType.ENUMERATION_8_BIT);
        serializer.serialize(loadLimitSupplyState, ZclDataType.ENUMERATION_8_BIT);
    }

    @Override
    public void deserialize(final ZclFieldDeserializer deserializer) {
        issuerEventId = (Integer) deserializer.deserialize(ZclDataType.UNSIGNED_32_BIT_INTEGER);
        supplyTamperState = (Integer) deserializer.deserialize(ZclDataType.ENUMERATION_8_BIT);
        supplyDepletionState = (Integer) deserializer.deserialize(ZclDataType.ENUMERATION_8_BIT);
        supplyUncontrolledFlowState = (Integer) deserializer.deserialize(ZclDataType.ENUMERATION_8_BIT);
        loadLimitSupplyState = (Integer) deserializer.deserialize(ZclDataType.ENUMERATION_8_BIT);
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(215);
        builder.append("SetSupplyStatus [");
        builder.append(super.toString());
        builder.append(", issuerEventId=");
        builder.append(issuerEventId);
        builder.append(", supplyTamperState=");
        builder.append(supplyTamperState);
        builder.append(", supplyDepletionState=");
        builder.append(supplyDepletionState);
        builder.append(", supplyUncontrolledFlowState=");
        builder.append(supplyUncontrolledFlowState);
        builder.append(", loadLimitSupplyState=");
        builder.append(loadLimitSupplyState);
        builder.append(']');
        return builder.toString();
    }

}
