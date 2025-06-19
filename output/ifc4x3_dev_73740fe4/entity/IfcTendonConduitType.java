package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcTendonConduitType extends IfcReinforcingElementType {

    public IfcTendonConduitTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcTendonConduitTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcTendonConduitTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcTendonConduitTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcTendonConduitTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
