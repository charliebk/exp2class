Public Class IfcTypeProcess Inherits IfcTypeObject
    Public Identification As IfcIdentifier
    Public LongDescription As IfcText
    Public ProcessType As IfcLabel

    ' === EXTENDED BY ===
    ' IfcEventType
    ' IfcProcedureType
    ' IfcTaskType

    ' === INVERSE CLAUSES ===
    ' OperatesOn : SET [0:?] OF IfcRelAssignsToProcess FOR RelatingProcess
End Class
