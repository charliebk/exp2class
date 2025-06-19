Public Class IfcRelConnectsPathElements Inherits IfcRelConnectsElements
    Public RelatingPriorities As List(Of IfcInteger)
    Public RelatedPriorities As List(Of IfcInteger)
    Public RelatedConnectionType As IfcConnectionTypeEnum
    Public RelatingConnectionType As IfcConnectionTypeEnum

    ' === WHERE CLAUSES ===
    ' NormalizedRelatedPriorities : (SIZEOF(RelatedPriorities) = 0) OR (SIZEOF (QUERY (temp <* RelatedPriorities | {0 <= temp <= 100} )) = SIZEOF(RelatedPriorities))
    ' NormalizedRelatingPriorities : (SIZEOF(RelatingPriorities) = 0) OR (SIZEOF (QUERY (temp <* RelatingPriorities | {0 <= temp <= 100} )) = SIZEOF(RelatingPriorities))
End Class
