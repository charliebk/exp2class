from typing import List

class IfcRelConnectsPathElements(IfcRelConnectsElements):
    def __init__(self):
        self.RelatingPriorities: List[IfcInteger] = None
        self.RelatedPriorities: List[IfcInteger] = None
        self.RelatedConnectionType: IfcConnectionTypeEnum = None
        self.RelatingConnectionType: IfcConnectionTypeEnum = None

    # === WHERE CLAUSES ===
    # NormalizedRelatedPriorities : (SIZEOF(RelatedPriorities) = 0) OR (SIZEOF (QUERY (temp <* RelatedPriorities | {0 <= temp <= 100} )) = SIZEOF(RelatedPriorities))
    # NormalizedRelatingPriorities : (SIZEOF(RelatingPriorities) = 0) OR (SIZEOF (QUERY (temp <* RelatingPriorities | {0 <= temp <= 100} )) = SIZEOF(RelatingPriorities))
