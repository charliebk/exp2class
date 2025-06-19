public class IfcStructuralAnalysisModel extends IfcSystem {
    public IfcAnalysisModelTypeEnum PredefinedType;
    public IfcAxis2Placement3D OrientationOf2DPlane;
    public SET [1:?] OF IfcStructuralLoadGroup LoadedBy;
    public SET [1:?] OF IfcStructuralResultGroup HasResults;
    public IfcObjectPlacement SharedPlacement;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcAnalysisModelTypeEnum.USERDEFINED) OR ((PredefinedType = IfcAnalysisModelTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
}
