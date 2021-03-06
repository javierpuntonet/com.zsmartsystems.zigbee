/**
 * Copyright (c) 2016-2020 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.zcl.clusters.demandresponseandloadcontrol;

import java.util.Calendar;

import javax.annotation.Generated;

import com.zsmartsystems.zigbee.zcl.ZclCommand;
import com.zsmartsystems.zigbee.zcl.ZclFieldDeserializer;
import com.zsmartsystems.zigbee.zcl.ZclFieldSerializer;
import com.zsmartsystems.zigbee.zcl.field.ByteArray;
import com.zsmartsystems.zigbee.zcl.protocol.ZclCommandDirection;
import com.zsmartsystems.zigbee.zcl.protocol.ZclDataType;

/**
 * Report Event Status value object class.
 * <p>
 * Cluster: <b>Demand Response And Load Control</b>. Command ID 0x00 is sent <b>TO</b> the server.
 * This command is a <b>specific</b> command used for the Demand Response And Load Control cluster.
 * <p>
 * Code is auto-generated. Modifications may be overwritten!
 */
@Generated(value = "com.zsmartsystems.zigbee.autocode.ZigBeeCodeGenerator", date = "2019-04-14T08:41:54Z")
public class ReportEventStatus extends ZclCommand {
    /**
     * The cluster ID to which this command belongs.
     */
    public static int CLUSTER_ID = 0x0701;

    /**
     * The command ID.
     */
    public static int COMMAND_ID = 0x00;

    /**
     * Issuer Event ID command message field.
     * <p>
     * Unique identifier generated by the Energy provider. The value of this field allows
     * matching of Event reports with a specific Demand Response and Load Control event. It's
     * expected the value contained in this field is a unique number managed by upstream
     * systems or a UTC based time stamp (UTCTime data type) identifying when the Load Control
     * Event was issued.
     */
    private Integer issuerEventId;

    /**
     * Event Status command message field.
     * <p>
     * This lists the valid values returned in the Event Status field.
     */
    private Integer eventStatus;

    /**
     * Event Status Time command message field.
     * <p>
     * UTC Timestamp representing when the event status occurred. This field shall not use the
     * value of 0x00000000.
     */
    private Calendar eventStatusTime;

    /**
     * Criticality Level Applied command message field.
     * <p>
     * Criticality Level value applied by the device, see the corresponding field in the Load
     * Control Event command for more information.
     */
    private Integer criticalityLevelApplied;

    /**
     * Cooling Temperature Set Point Applied command message field.
     * <p>
     * Cooling Temperature Set Point value applied by the device, see the corresponding field
     * in the Load Control Event command for more information. The value 0x8000 means that this
     * field has not been used by the end device.
     */
    private Integer coolingTemperatureSetPointApplied;

    /**
     * Heating Temperature Set Point Applied command message field.
     * <p>
     * Heating Temperature Set Point value applied by the device, see the corresponding field
     * in the Load Control Event command for more information. The value 0x8000 means that this
     * field has not been used by the end device.
     */
    private Integer heatingTemperatureSetPointApplied;

    /**
     * Average Load Adjustment Percentage Applied command message field.
     * <p>
     * Average Load Adjustment Percentage value applied by the device, see the corresponding
     * field in the Load Control Event command for more information. The value 0x80 means that
     * this field has not been used by the end device.
     */
    private Integer averageLoadAdjustmentPercentageApplied;

    /**
     * Duty Cycle Applied command message field.
     * <p>
     * Defines the maximum On state duty cycle applied by the device. The value 0xFF means that
     * this field has not been used by the end device.
     */
    private Integer dutyCycleApplied;

    /**
     * Event Control command message field.
     * <p>
     * Identifies additional control options for the event.
     */
    private Integer eventControl;

    /**
     * Signature Type command message field.
     * <p>
     * An 8-bit Unsigned integer enumerating the type of algorithm use to create the
     * Signature.
     */
    private Integer signatureType;

    /**
     * Signature command message field.
     * <p>
     * A non-repudiation signature created by using the Matyas-Meyer-Oseas hash function
     * used in conjunction with ECDSA.
     */
    private ByteArray signature;

    /**
     * Default constructor.
     */
    public ReportEventStatus() {
        clusterId = CLUSTER_ID;
        commandId = COMMAND_ID;
        genericCommand = false;
        commandDirection = ZclCommandDirection.CLIENT_TO_SERVER;
    }

    /**
     * Gets Issuer Event ID.
     * <p>
     * Unique identifier generated by the Energy provider. The value of this field allows
     * matching of Event reports with a specific Demand Response and Load Control event. It's
     * expected the value contained in this field is a unique number managed by upstream
     * systems or a UTC based time stamp (UTCTime data type) identifying when the Load Control
     * Event was issued.
     *
     * @return the Issuer Event ID
     */
    public Integer getIssuerEventId() {
        return issuerEventId;
    }

    /**
     * Sets Issuer Event ID.
     * <p>
     * Unique identifier generated by the Energy provider. The value of this field allows
     * matching of Event reports with a specific Demand Response and Load Control event. It's
     * expected the value contained in this field is a unique number managed by upstream
     * systems or a UTC based time stamp (UTCTime data type) identifying when the Load Control
     * Event was issued.
     *
     * @param issuerEventId the Issuer Event ID
     */
    public void setIssuerEventId(final Integer issuerEventId) {
        this.issuerEventId = issuerEventId;
    }

    /**
     * Gets Event Status.
     * <p>
     * This lists the valid values returned in the Event Status field.
     *
     * @return the Event Status
     */
    public Integer getEventStatus() {
        return eventStatus;
    }

    /**
     * Sets Event Status.
     * <p>
     * This lists the valid values returned in the Event Status field.
     *
     * @param eventStatus the Event Status
     */
    public void setEventStatus(final Integer eventStatus) {
        this.eventStatus = eventStatus;
    }

    /**
     * Gets Event Status Time.
     * <p>
     * UTC Timestamp representing when the event status occurred. This field shall not use the
     * value of 0x00000000.
     *
     * @return the Event Status Time
     */
    public Calendar getEventStatusTime() {
        return eventStatusTime;
    }

    /**
     * Sets Event Status Time.
     * <p>
     * UTC Timestamp representing when the event status occurred. This field shall not use the
     * value of 0x00000000.
     *
     * @param eventStatusTime the Event Status Time
     */
    public void setEventStatusTime(final Calendar eventStatusTime) {
        this.eventStatusTime = eventStatusTime;
    }

    /**
     * Gets Criticality Level Applied.
     * <p>
     * Criticality Level value applied by the device, see the corresponding field in the Load
     * Control Event command for more information.
     *
     * @return the Criticality Level Applied
     */
    public Integer getCriticalityLevelApplied() {
        return criticalityLevelApplied;
    }

    /**
     * Sets Criticality Level Applied.
     * <p>
     * Criticality Level value applied by the device, see the corresponding field in the Load
     * Control Event command for more information.
     *
     * @param criticalityLevelApplied the Criticality Level Applied
     */
    public void setCriticalityLevelApplied(final Integer criticalityLevelApplied) {
        this.criticalityLevelApplied = criticalityLevelApplied;
    }

    /**
     * Gets Cooling Temperature Set Point Applied.
     * <p>
     * Cooling Temperature Set Point value applied by the device, see the corresponding field
     * in the Load Control Event command for more information. The value 0x8000 means that this
     * field has not been used by the end device.
     *
     * @return the Cooling Temperature Set Point Applied
     */
    public Integer getCoolingTemperatureSetPointApplied() {
        return coolingTemperatureSetPointApplied;
    }

    /**
     * Sets Cooling Temperature Set Point Applied.
     * <p>
     * Cooling Temperature Set Point value applied by the device, see the corresponding field
     * in the Load Control Event command for more information. The value 0x8000 means that this
     * field has not been used by the end device.
     *
     * @param coolingTemperatureSetPointApplied the Cooling Temperature Set Point Applied
     */
    public void setCoolingTemperatureSetPointApplied(final Integer coolingTemperatureSetPointApplied) {
        this.coolingTemperatureSetPointApplied = coolingTemperatureSetPointApplied;
    }

    /**
     * Gets Heating Temperature Set Point Applied.
     * <p>
     * Heating Temperature Set Point value applied by the device, see the corresponding field
     * in the Load Control Event command for more information. The value 0x8000 means that this
     * field has not been used by the end device.
     *
     * @return the Heating Temperature Set Point Applied
     */
    public Integer getHeatingTemperatureSetPointApplied() {
        return heatingTemperatureSetPointApplied;
    }

    /**
     * Sets Heating Temperature Set Point Applied.
     * <p>
     * Heating Temperature Set Point value applied by the device, see the corresponding field
     * in the Load Control Event command for more information. The value 0x8000 means that this
     * field has not been used by the end device.
     *
     * @param heatingTemperatureSetPointApplied the Heating Temperature Set Point Applied
     */
    public void setHeatingTemperatureSetPointApplied(final Integer heatingTemperatureSetPointApplied) {
        this.heatingTemperatureSetPointApplied = heatingTemperatureSetPointApplied;
    }

    /**
     * Gets Average Load Adjustment Percentage Applied.
     * <p>
     * Average Load Adjustment Percentage value applied by the device, see the corresponding
     * field in the Load Control Event command for more information. The value 0x80 means that
     * this field has not been used by the end device.
     *
     * @return the Average Load Adjustment Percentage Applied
     */
    public Integer getAverageLoadAdjustmentPercentageApplied() {
        return averageLoadAdjustmentPercentageApplied;
    }

    /**
     * Sets Average Load Adjustment Percentage Applied.
     * <p>
     * Average Load Adjustment Percentage value applied by the device, see the corresponding
     * field in the Load Control Event command for more information. The value 0x80 means that
     * this field has not been used by the end device.
     *
     * @param averageLoadAdjustmentPercentageApplied the Average Load Adjustment Percentage Applied
     */
    public void setAverageLoadAdjustmentPercentageApplied(final Integer averageLoadAdjustmentPercentageApplied) {
        this.averageLoadAdjustmentPercentageApplied = averageLoadAdjustmentPercentageApplied;
    }

    /**
     * Gets Duty Cycle Applied.
     * <p>
     * Defines the maximum On state duty cycle applied by the device. The value 0xFF means that
     * this field has not been used by the end device.
     *
     * @return the Duty Cycle Applied
     */
    public Integer getDutyCycleApplied() {
        return dutyCycleApplied;
    }

    /**
     * Sets Duty Cycle Applied.
     * <p>
     * Defines the maximum On state duty cycle applied by the device. The value 0xFF means that
     * this field has not been used by the end device.
     *
     * @param dutyCycleApplied the Duty Cycle Applied
     */
    public void setDutyCycleApplied(final Integer dutyCycleApplied) {
        this.dutyCycleApplied = dutyCycleApplied;
    }

    /**
     * Gets Event Control.
     * <p>
     * Identifies additional control options for the event.
     *
     * @return the Event Control
     */
    public Integer getEventControl() {
        return eventControl;
    }

    /**
     * Sets Event Control.
     * <p>
     * Identifies additional control options for the event.
     *
     * @param eventControl the Event Control
     */
    public void setEventControl(final Integer eventControl) {
        this.eventControl = eventControl;
    }

    /**
     * Gets Signature Type.
     * <p>
     * An 8-bit Unsigned integer enumerating the type of algorithm use to create the
     * Signature.
     *
     * @return the Signature Type
     */
    public Integer getSignatureType() {
        return signatureType;
    }

    /**
     * Sets Signature Type.
     * <p>
     * An 8-bit Unsigned integer enumerating the type of algorithm use to create the
     * Signature.
     *
     * @param signatureType the Signature Type
     */
    public void setSignatureType(final Integer signatureType) {
        this.signatureType = signatureType;
    }

    /**
     * Gets Signature.
     * <p>
     * A non-repudiation signature created by using the Matyas-Meyer-Oseas hash function
     * used in conjunction with ECDSA.
     *
     * @return the Signature
     */
    public ByteArray getSignature() {
        return signature;
    }

    /**
     * Sets Signature.
     * <p>
     * A non-repudiation signature created by using the Matyas-Meyer-Oseas hash function
     * used in conjunction with ECDSA.
     *
     * @param signature the Signature
     */
    public void setSignature(final ByteArray signature) {
        this.signature = signature;
    }

    @Override
    public void serialize(final ZclFieldSerializer serializer) {
        serializer.serialize(issuerEventId, ZclDataType.UNSIGNED_32_BIT_INTEGER);
        serializer.serialize(eventStatus, ZclDataType.ENUMERATION_8_BIT);
        serializer.serialize(eventStatusTime, ZclDataType.UTCTIME);
        serializer.serialize(criticalityLevelApplied, ZclDataType.ENUMERATION_8_BIT);
        serializer.serialize(coolingTemperatureSetPointApplied, ZclDataType.UNSIGNED_16_BIT_INTEGER);
        serializer.serialize(heatingTemperatureSetPointApplied, ZclDataType.UNSIGNED_16_BIT_INTEGER);
        serializer.serialize(averageLoadAdjustmentPercentageApplied, ZclDataType.SIGNED_8_BIT_INTEGER);
        serializer.serialize(dutyCycleApplied, ZclDataType.UNSIGNED_8_BIT_INTEGER);
        serializer.serialize(eventControl, ZclDataType.BITMAP_8_BIT);
        serializer.serialize(signatureType, ZclDataType.ENUMERATION_8_BIT);
        serializer.serialize(signature, ZclDataType.OCTET_STRING);
    }

    @Override
    public void deserialize(final ZclFieldDeserializer deserializer) {
        issuerEventId = (Integer) deserializer.deserialize(ZclDataType.UNSIGNED_32_BIT_INTEGER);
        eventStatus = (Integer) deserializer.deserialize(ZclDataType.ENUMERATION_8_BIT);
        eventStatusTime = (Calendar) deserializer.deserialize(ZclDataType.UTCTIME);
        criticalityLevelApplied = (Integer) deserializer.deserialize(ZclDataType.ENUMERATION_8_BIT);
        coolingTemperatureSetPointApplied = (Integer) deserializer.deserialize(ZclDataType.UNSIGNED_16_BIT_INTEGER);
        heatingTemperatureSetPointApplied = (Integer) deserializer.deserialize(ZclDataType.UNSIGNED_16_BIT_INTEGER);
        averageLoadAdjustmentPercentageApplied = (Integer) deserializer.deserialize(ZclDataType.SIGNED_8_BIT_INTEGER);
        dutyCycleApplied = (Integer) deserializer.deserialize(ZclDataType.UNSIGNED_8_BIT_INTEGER);
        eventControl = (Integer) deserializer.deserialize(ZclDataType.BITMAP_8_BIT);
        signatureType = (Integer) deserializer.deserialize(ZclDataType.ENUMERATION_8_BIT);
        signature = (ByteArray) deserializer.deserialize(ZclDataType.OCTET_STRING);
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(456);
        builder.append("ReportEventStatus [");
        builder.append(super.toString());
        builder.append(", issuerEventId=");
        builder.append(issuerEventId);
        builder.append(", eventStatus=");
        builder.append(eventStatus);
        builder.append(", eventStatusTime=");
        builder.append(eventStatusTime);
        builder.append(", criticalityLevelApplied=");
        builder.append(criticalityLevelApplied);
        builder.append(", coolingTemperatureSetPointApplied=");
        builder.append(coolingTemperatureSetPointApplied);
        builder.append(", heatingTemperatureSetPointApplied=");
        builder.append(heatingTemperatureSetPointApplied);
        builder.append(", averageLoadAdjustmentPercentageApplied=");
        builder.append(averageLoadAdjustmentPercentageApplied);
        builder.append(", dutyCycleApplied=");
        builder.append(dutyCycleApplied);
        builder.append(", eventControl=");
        builder.append(eventControl);
        builder.append(", signatureType=");
        builder.append(signatureType);
        builder.append(", signature=");
        builder.append(signature);
        builder.append(']');
        return builder.toString();
    }

}
