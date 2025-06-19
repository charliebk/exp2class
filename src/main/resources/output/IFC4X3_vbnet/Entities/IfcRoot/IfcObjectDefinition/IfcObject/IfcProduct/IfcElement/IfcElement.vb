Public Class IfcElement Inherits IfcProduct
    Public Tag As IfcIdentifier

    ' === EXTENDED BY ===
    ' IfcBuiltElement
    ' IfcCivilElement
    ' IfcDistributionElement
    ' IfcElementAssembly
    ' IfcElementComponent
    ' IfcFeatureElement
    ' IfcFurnishingElement
    ' IfcGeographicElement
    ' IfcGeotechnicalElement
    ' IfcTransportationDevice
    ' IfcVirtualElement

    ' === INVERSE CLAUSES ===
    ' FillsVoids : SET [0:1] OF IfcRelFillsElement FOR RelatedBuildingElement
    ' ConnectedTo : SET [0:?] OF IfcRelConnectsElements FOR RelatingElement
    ' IsInterferedByElements : SET [0:?] OF IfcRelInterferesElements FOR RelatedElement
    ' InterferesElements : SET [0:?] OF IfcRelInterferesElements FOR RelatingElement
    ' HasProjections : SET [0:?] OF IfcRelProjectsElement FOR RelatingElement
    ' HasOpenings : SET [0:?] OF IfcRelVoidsElement FOR RelatingBuildingElement
    ' IsConnectionRealization : SET [0:?] OF IfcRelConnectsWithRealizingElements FOR RealizingElements
    ' ProvidesBoundaries : SET [0:?] OF IfcRelSpaceBoundary FOR RelatedBuildingElement
    ' ConnectedFrom : SET [0:?] OF IfcRelConnectsElements FOR RelatedElement
    ' ContainedInStructure : SET [0:1] OF IfcRelContainedInSpatialStructure FOR RelatedElements
    ' HasCoverings : SET [0:?] OF IfcRelCoversBldgElements FOR RelatingBuildingElement
    ' HasSurfaceFeatures : SET [0:?] OF IfcRelAdheresToElement FOR RelatingElement
End Class
