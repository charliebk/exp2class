public class IfcPhysicalQuantity {
    public IfcLabel Name;
    public IfcText Description;

    // === EXTENDED BY ===
    // IfcPhysicalComplexQuantity
    // IfcPhysicalSimpleQuantity

    // === INVERSE CLAUSES ===
    // HasExternalReferences : SET [0:?] OF IfcExternalReferenceRelationship FOR RelatedResourceObjects
    // PartOfComplex : SET [0:1] OF IfcPhysicalComplexQuantity FOR HasQuantities
}
