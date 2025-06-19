Public Class IfcEdgeLoop Inherits IfcLoop
    Public EdgeList As List(Of IfcOrientedEdge)

    ' === WHERE CLAUSES ===
    ' IsClosed : (EdgeList[1].EdgeStart) :=: (EdgeList[Ne].EdgeEnd)
    ' IsContinuous : IfcLoopHeadToTail(SELF)

    ' === DERIVE CLAUSES ===
    ' Ne : IfcInteger := SIZEOF(EdgeList)
End Class
