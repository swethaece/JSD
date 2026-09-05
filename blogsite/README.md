# Everyday Tech Tips — Blog Site

A static, multi-page blog site built with HTML and CSS for the **TIFC-FM-TUC-PRJ2 Blog Site Group Assessment**.

## Structure
```
blogsite/
├── index.html          Home page (posts grid, hero banner)
├── about.html           About Us page (team + mission)
├── contact.html          Contact Us page (details + demo form)
├── css/
│   └── style.css        Shared stylesheet (sticky nav, footer, layout)
├── images/               Generated illustrative graphics
└── README.md
```

## How to use
Open `index.html` in a browser — no build step or server required. All three pages
share the same sticky navigation bar and footer.

## Rubric checklist mapping
- **Task 3 (Nav menu):** `header.site-header` is repeated on all pages, uses `position: sticky`,
  and links to Home / About Us / Contact Us.
- **Task 4 (Footer):** `footer.site-footer` lists authors, a contact email, and the project name,
  and appears on every page.
- **Task 5 (Home page):** Written content using `h1`–`h3` and `p` tags, three post images, and CSS styling.
- **Task 6 (About Us):** Describes the group and why the site exists.
- **Task 7 (Contact Us):** Fake email addresses, phone number, and a contact form.

## Suggested SCRUM backlog (Task 2)

| # | User Story | Type | Priority | Status |
|---|------------|------|----------|--------|
| 1 | As a visitor, I can navigate between Home/About/Contact from any page | Feature | High | Done |
| 2 | As a visitor, I see a consistent footer with contact info on every page | Feature | High | Done |
| 3 | As a visitor, I can read blog posts with images on the Home page | Feature | High | Done |
| 4 | As a visitor, I can learn about the team on the About Us page | Feature | Medium | Done |
| 5 | As a visitor, I can find contact details and send a message | Feature | Medium | Done |
| 6 | As a developer, the site is responsive on mobile screens | Chore | Medium | Done |
| 7 | As a developer, styles are centralized in one stylesheet | Chore | Low | Done |
| 8 | As a team, we track tasks as GitHub Issues/Cards | Chore | High | To do — create in your repo |

> Replace the sample authors, emails, and team bios with your actual group's details
> before submitting.

## Git workflow reminder (TUC-TIFC-201.1)
```bash
git init                        # if starting fresh
git remote add origin <your-repo-url>
git add .
git commit -m "Add blog site: home, about, contact pages with shared nav/footer"
git push -u origin main
```
