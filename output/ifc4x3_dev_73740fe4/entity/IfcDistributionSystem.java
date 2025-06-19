package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcDistributionSystem extends IfcSystem {

    public IfcLabel LongName; // OPTIONAL
    public IfcDistributionSystemEnum PredefinedType; // OPTIONAL
    // INVERSE attributes:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcDistributionSystemEnum.USERDEFINED) OR
    // ((PredefinedType = IfcDistributionSystemEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));

    // SUPERTYPE OF:
    // - IfcDistributionCircuit SUBTYPE OF IfcSystem

    // WHERE constraints:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcDistributionSystemEnum.USERDEFINED) OR
    // ((PredefinedType = IfcDistributionSystemEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));
}
