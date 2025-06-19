package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.Set;

public class IfcStructuralAnalysisModel extends IfcSystem {

    public IfcAnalysisModelTypeEnum PredefinedType;
    public IfcAxis2Placement3D OrientationOf2DPlane; // OPTIONAL
    public IfcObjectPlacement SharedPlacement; // OPTIONAL
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcAnalysisModelTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcAnalysisModelTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcAnalysisModelTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcAnalysisModelTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));
}
