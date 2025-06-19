Public Class IfcContext Inherits IfcObjectDefinition
    Public ObjectType As IfcLabel
    Public LongName As IfcLabel
    Public Phase As IfcLabel
    Public RepresentationContexts As SET [1:?] OF IfcRepresentationContext
    Public UnitsInContext As IfcUnitAssignment

    ' === EXTENDED BY ===
    ' IfcProject
    ' IfcProjectLibrary

    ' === INVERSE CLAUSES ===
    ' IsDefinedBy : SET [0:?] OF IfcRelDefinesByProperties FOR RelatedObjects
    ' Declares : SET [0:?] OF IfcRelDeclares FOR RelatingContext
End Class
