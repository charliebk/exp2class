public class IfcObjectDefinition extends IfcRoot {

    // === EXTENDED BY ===
    // IfcContext
    // IfcObject
    // IfcTypeObject

    // === INVERSE CLAUSES ===
    // HasAssignments : SET [0:?] OF IfcRelAssigns FOR RelatedObjects
    // Nests : SET [0:1] OF IfcRelNests FOR RelatedObjects
    // IsNestedBy : SET [0:?] OF IfcRelNests FOR RelatingObject
    // HasContext : SET [0:1] OF IfcRelDeclares FOR RelatedDefinitions
    // IsDecomposedBy : SET [0:?] OF IfcRelAggregates FOR RelatingObject
    // Decomposes : SET [0:1] OF IfcRelAggregates FOR RelatedObjects
    // HasAssociations : SET [0:?] OF IfcRelAssociates FOR RelatedObjects
}
