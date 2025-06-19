package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcElectricFlowTreatmentDeviceType extends IfcFlowTreatmentDeviceType {

    public IfcElectricFlowTreatmentDeviceTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcElectricFlowTreatmentDeviceTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcElectricFlowTreatmentDeviceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcElectricFlowTreatmentDeviceTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcElectricFlowTreatmentDeviceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
