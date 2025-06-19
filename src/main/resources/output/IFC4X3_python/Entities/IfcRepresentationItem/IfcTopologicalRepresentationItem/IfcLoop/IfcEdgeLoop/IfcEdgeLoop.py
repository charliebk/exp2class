from typing import List

class IfcEdgeLoop(IfcLoop):
    def __init__(self):
        self.EdgeList: List[IfcOrientedEdge] = None

    # === WHERE CLAUSES ===
    # IsClosed : (EdgeList[1].EdgeStart) :=: (EdgeList[Ne].EdgeEnd)
    # IsContinuous : IfcLoopHeadToTail(SELF)

    # === DERIVE CLAUSES ===
    # Ne : IfcInteger := SIZEOF(EdgeList)
