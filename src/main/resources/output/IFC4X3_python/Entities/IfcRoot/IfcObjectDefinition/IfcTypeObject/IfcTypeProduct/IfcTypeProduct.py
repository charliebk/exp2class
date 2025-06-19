from typing import List

class IfcTypeProduct(IfcTypeObject):
    def __init__(self):
        self.RepresentationMaps: List[UNIQUE IfcRepresentationMap] = None
        self.Tag: IfcLabel = None

    # === EXTENDED BY ===
    # IfcElementType
    # IfcSpatialElementType

    # === INVERSE CLAUSES ===
    # ReferencedBy : SET [0:?] OF IfcRelAssignsToProduct FOR RelatingProduct

    # === WHERE CLAUSES ===
    # ApplicableOccurrence : NOT(EXISTS(SELF\IfcTypeObject.Types[1])) OR (SIZEOF(QUERY(temp <* SELF\IfcTypeObject.Types[1].RelatedObjects | NOT('IFC4X3_DEV_73740fe4.IFCPRODUCT' IN TYPEOF(temp))) ) = 0)
