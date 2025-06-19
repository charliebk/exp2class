from typing import List

class IfcRelNests(IfcRelDecomposes):
    def __init__(self):
        self.RelatingObject: IfcObjectDefinition = None
        self.RelatedObjects: List[IfcObjectDefinition] = None

    # === WHERE CLAUSES ===
    # NoSelfReference : SIZEOF(QUERY(Temp <* RelatedObjects | RelatingObject :=: Temp)) = 0
