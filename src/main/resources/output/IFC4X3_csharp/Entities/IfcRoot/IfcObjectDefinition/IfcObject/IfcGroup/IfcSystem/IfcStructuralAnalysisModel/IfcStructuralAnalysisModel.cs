public class IfcStructuralAnalysisModel : IfcSystem
{
    public IfcAnalysisModelTypeEnum PredefinedType { get; set; }
    public IfcAxis2Placement3D OrientationOf2DPlane { get; set; }
    public SET [1:?] OF IfcStructuralLoadGroup LoadedBy { get; set; }
    public SET [1:?] OF IfcStructuralResultGroup HasResults { get; set; }
    public IfcObjectPlacement SharedPlacement { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcAnalysisModelTypeEnum.USERDEFINED) OR ((PredefinedType = IfcAnalysisModelTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
}
