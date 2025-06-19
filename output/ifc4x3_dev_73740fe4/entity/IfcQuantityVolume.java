package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcQuantityVolume extends IfcPhysicalSimpleQuantity {

    public IfcVolumeMeasure VolumeValue;
    public IfcLabel Formula; // OPTIONAL
    // INVERSE attributes:
    // WR21 : NOT(EXISTS(SELF\IfcPhysicalSimpleQuantity.Unit)) OR
    // (SELF\IfcPhysicalSimpleQuantity.Unit.UnitType = IfcUnitEnum.VOLUMEUNIT);
    // WR22 : VolumeValue >= 0.;

    // WHERE constraints:
    // WR21 : NOT(EXISTS(SELF\IfcPhysicalSimpleQuantity.Unit)) OR
    // (SELF\IfcPhysicalSimpleQuantity.Unit.UnitType = IfcUnitEnum.VOLUMEUNIT);
    // WR22 : VolumeValue >= 0.;
}
