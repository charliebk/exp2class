from typing import List

class IfcPath(IfcTopologicalRepresentationItem):
    def __init__(self):
        self.EdgeList: List[UNIQUE IfcOrientedEdge] = None

    # === WHERE CLAUSES ===
    # IsContinuous : IfcPathHeadToTail(SELF)
