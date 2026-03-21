package sorting;

public class Deefense_kingdom {
      // Mark blocked rows and columns
    vector<bool> blockedRow(h + 1, false);
    vector<bool> blockedCol(w + 1, false);

    for (auto &t : towers) {
        blockedCol[t.first] = true;  // column
        blockedRow[t.second] = true; // row
    }

    int maxArea = 0;

    // Try all rectangles
    for (int top = 1; top <= h; top++) {
        for (int bottom = top; bottom <= h; bottom++) {

            // Check if any blocked row exists in this range
            bool validRow = true;
            for (int r = top; r <= bottom; r++) {
                if (blockedRow[r]) {
                    validRow = false;
                    break;
                }
            }
            if (!validRow) continue;

            for (int left = 1; left <= w; left++) {
                for (int right = left; right <= w; right++) {

                    // Check if any blocked column exists
                    bool validCol = true;
                    for (int c = left; c <= right; c++) {
                        if (blockedCol[c]) {
                            validCol = false;
                            break;
                        }
                    }

                    if (validCol) {
                        int area = (bottom - top + 1) * (right - left + 1);
                        maxArea = max(maxArea, area);
                    }
                }
            }
        }
    }

    return maxArea;
}