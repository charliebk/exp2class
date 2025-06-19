from typing import List

class IfcTableRow:
    def __init__(self):
        self.RowCells: List[IfcValue] = None
        self.IsHeading: IfcBoolean = None
