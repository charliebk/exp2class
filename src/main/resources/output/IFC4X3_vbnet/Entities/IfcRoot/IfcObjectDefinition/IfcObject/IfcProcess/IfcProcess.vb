Public Class IfcProcess Inherits IfcObject
    Public Identification As IfcIdentifier
    Public LongDescription As IfcText

    ' === EXTENDED BY ===
    ' IfcEvent
    ' IfcProcedure
    ' IfcTask

    ' === INVERSE CLAUSES ===
    ' IsPredecessorTo : SET [0:?] OF IfcRelSequence FOR RelatingProcess
    ' IsSuccessorFrom : SET [0:?] OF IfcRelSequence FOR RelatedProcess
    ' OperatesOn : SET [0:?] OF IfcRelAssignsToProcess FOR RelatingProcess
End Class
