package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcBuildingElementProxy extends IfcBuiltElement {

    public IfcBuildingElementProxyTypeEnum PredefinedType; // OPTIONAL
    // INVERSE attributes:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcBuildingElementProxyTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcBuildingElementProxyTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR
    // ('IFC4X3_DEV_73740fe4.IFCBUILDINGELEMENTPROXYTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType));
    // HasObjectName : EXISTS(SELF\IfcRoot.Name);

    // WHERE constraints:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcBuildingElementProxyTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcBuildingElementProxyTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR
    // ('IFC4X3_DEV_73740fe4.IFCBUILDINGELEMENTPROXYTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType));
    // HasObjectName : EXISTS(SELF\IfcRoot.Name);
}
