package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcElectricApplianceType extends IfcFlowTerminalType {

    public IfcElectricApplianceTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcElectricApplianceTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcElectricApplianceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcElectricApplianceTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcElectricApplianceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
