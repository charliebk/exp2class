package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcStructuralCurveReaction extends IfcStructuralReaction {

    public IfcStructuralCurveActivityTypeEnum PredefinedType;
    // INVERSE attributes:
    // HasObjectType : (PredefinedType <> IfcStructuralCurveActivityTypeEnum.USERDEFINED) OR EXISTS(SELF\IfcObject.ObjectType);
    // SuitablePredefinedType : (PredefinedType <> IfcStructuralCurveActivityTypeEnum.SINUS) AND (PredefinedType <> IfcStructuralCurveActivityTypeEnum.PARABOLA);

    // WHERE constraints:
    // HasObjectType : (PredefinedType <> IfcStructuralCurveActivityTypeEnum.USERDEFINED) OR EXISTS(SELF\IfcObject.ObjectType);
    // SuitablePredefinedType : (PredefinedType <> IfcStructuralCurveActivityTypeEnum.SINUS) AND (PredefinedType <> IfcStructuralCurveActivityTypeEnum.PARABOLA);
}
