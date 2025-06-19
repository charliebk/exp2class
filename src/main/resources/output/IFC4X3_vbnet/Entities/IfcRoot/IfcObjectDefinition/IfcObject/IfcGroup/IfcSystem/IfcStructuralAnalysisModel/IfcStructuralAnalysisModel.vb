Public Class IfcStructuralAnalysisModel Inherits IfcSystem
    Public PredefinedType As IfcAnalysisModelTypeEnum
    Public OrientationOf2DPlane As IfcAxis2Placement3D
    Public LoadedBy As SET [1:?] OF IfcStructuralLoadGroup
    Public HasResults As SET [1:?] OF IfcStructuralResultGroup
    Public SharedPlacement As IfcObjectPlacement

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcAnalysisModelTypeEnum.USERDEFINED) OR ((PredefinedType = IfcAnalysisModelTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
End Class
