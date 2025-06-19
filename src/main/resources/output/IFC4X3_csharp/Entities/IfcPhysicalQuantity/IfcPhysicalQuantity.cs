public class IfcPhysicalQuantity
{
    public IfcLabel Name { get; set; }
    public IfcText Description { get; set; }

    // === EXTENDED BY ===
    // IfcPhysicalComplexQuantity
    // IfcPhysicalSimpleQuantity

    // === INVERSE CLAUSES ===
    // HasExternalReferences : SET [0:?] OF IfcExternalReferenceRelationship FOR RelatedResourceObjects
    // PartOfComplex : SET [0:1] OF IfcPhysicalComplexQuantity FOR HasQuantities
}
