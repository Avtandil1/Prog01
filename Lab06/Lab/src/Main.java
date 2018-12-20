

stroke(255, 0, 0);

        strokeWeight(3);


        float x = width / 2;

        float y = height / 2;


        line(x, y, x, y + r);

        line(x, y, x, y - r);


        line(x, y, x + r, y);

        line(x, y, x - r, y);


        line(x, y, x + r / 4, y - r / 4);

        line(x, y, x - r / 4, y + r / 4);


        line(x, y, x - r / 4, y - r / 4);

        line(x, y, x + r / 4, y + r / 4);


        line(x, y - r, x + r / 4, y - r / 4);

        line(x, y - r, x - r / 4, y - r / 4);

        line(x, y + r, x + r / 4, y + r / 4);

        line(x, y + r, x - r / 4, y + r / 4);


        line(x + r, y, x + r / 4, y - r / 4);

        line(x + r, y, x + r / 4, y + r / 4);

        line(x - r, y, x - r / 4, y - r / 4);

        line(x - r, y, x - r / 4, y + r / 4);

        r += dr;

        if (r < 70) {

        dr = -dr;

        }

        if (r > 150) {

        dr = -dr;

        }

