# Portfolio Project Directions

Welcome to the portfolio project directions. Historically, this assignment
was completed in parts. But due to the excessive grading load that the
assignment created, the portfolio project was converted to a single submission.
The individual steps were maintained in this repo for your reference, but the
assignment must be completed as outlined in this document. In other words,
**ignore** any submission instructions you see in the individual docs.

## Assignment Description

In this assignment, you are tasked with creating a software component from
scratch using OSU's discipline as follows:

- Create the kernel and enhanced interfaces as described in the
   [component interfaces docs](03-component-interfaces\03-component-interfaces.md)
- Create the secondary abstract class as described in the
   [component abstract class docs](04-component-abstract-class\04-component-abstract-class.md)
- Create one kernel implementation as described in the
   [component kernel implementation docs](05-component-kernel-implementation\05-component-kernel-implementation.md)

In addition, you must complete the following tasks:

- Write a systematic test suite for all methods in each interface as well as the
  common methods as described in the
  [finishing touches doc](06-component-finishing-touches\06-component-finishing-touches.md)
- Write two qualitatively different use cases for your component as described in the
  [finishing touches doc](06-component-finishing-touches\06-component-finishing-touches.md)

Finally, you may take your component above and beyond expectations by
completing the following tasks:

- Create a CI pipeline that automates your testing on GitHub
- Generate documentation for you component using JavaDoc
- Version your component using your preferred versioning style

## Assignment Rubric

The assignment is graded broadly on the following categories. See Carmen for
the official rubric:

- **Discipline** (30%): how well does the component follow the discipline?
- **Testing** (25%): how systematic are the test cases?
- **Best Practices** (20%): how well-written is the code?
- **Use Cases** (15%): how well do the use cases show off the component?
- **Reflection** (10%): how thoughtful is the writing?

## Assignment Instructions

To complete the assignment, you must do the following **in order**:

1. Review this entire document from top-to-bottom
   - Make sure you have read the rubric and know how you're being assessed
2. Use this repo as a template, as described in the main [README](../README.md)
3. Clone this repo to your machine
4. Create a new branch from `main` and complete all of your work on it
   - `main` must only contain the template files at the time of submission
   - The new branch may be called whatever you like, but `portfolio-project` is
     fine
5. Create your component on your new branch
   - Commit early and often
   - Use descriptive commit messages (e.g., "Add enhanced interfaces")
6. Test your component and include two use cases showing it off
7. Complete the reflection in the next section
8. Create a pull request from your branch to `main`
9. Submit a link of the pull request to Carmen

## Assignment Reflection

Following the completion of the portfolio project, please take some time to
fill out the following reflection prompts. There is no word count, but at least
a few sentences per question would be ideal.

> A common gripe that students express is how much they feel the work they do
> in class fails to map to the real world. Now that you've had a chance to
> complete the portfolio project, how much better (or worse) do you think you
> understand software development and why?

I think I understand software development a lot better now as in class we only implement parts of a component and specially for me I used to sometimes ignore the parts of the project file that were already completed for us, such as the private members for example during class implementation. Doing this project really forced me to look at all the different parts of files of previous projects, so I could understand those implementations better and then use that understanding to implement my own component. Overall, I think the portfolio project helped me understand software developement a lot more than I did before.

> Also, did the portfolio project surface any gaps in your own knowledge of
> software development. If so, what are those gaps and how did you address them?

The portfolio project did surface some gaps in my knowledge of software developement, as I mentioned in the question above I didn't pay close attention to some of the pre-filled parts of the project files and did not try to understand the concept thoroughly, however doing the project did help me understand the purpose of those parts and how to implement them. I also learned how to implement an interface, which was something I hadn't done before.

> Finally, as a part of completing the portfolio project, to what extent has
> your perspective of software development changed, if at all? In other words,
> is software development something you still enjoy? If not, why not?

I think I definitely still enjoy software development, I think I enjoyed working on this project more than our class projects, as I had more flexibility on what I could do.

> One of the challenges of completing the portfolio project is picking up a lot
> of skills on your own. Some of these skills are, of course, software skills.
> However, there are plenty of other skills you may have picked up through
> this process. Therefore, the first question is what skills did you pick up
> through this process?

I think I picked up a lot of software skills, learned how to piece different parts of a component together, how to write different files for components, how to use Git better and manage branches, and how to implement enums.

> The follow-up question is: could you rephrase these skills you picked up
> as bullet points that you could put on a resume? Try it below.

- Software Development Skills
- Version Control Skills
- Problem Solving

> Next, how has working on this project affected your career trajectory?
> In other words, do you now hate the topic you picked? Or, are you even more
> interested in it? Both outcomes are valuable to your personal development.

I am definitely more interested in the topic I picked, and I would like to look at more oppurtunities to work on this more in the future. Possibly polish the component more and implement for an actual reading tracker.

> Finally, consider the skills you've picked up and your current career
> trajectory. What are some things you could do to continue on your
> career trajectory? Also, who are some mentors you could contact to help
> you stay on your path?

I think to continue on my career trajectory would be to keep building on this component possibly and create new software components from scratch. I think doing this will give me practice and a better understanding. I think some mentors I could contact to help stay on my path would definitely be my professors.

## Assignment Advice

Broadly, this assignment may take anywhere from a few hours to over a full work
week (i.e., 40 hours) to complete depending on the complexity of your design.
Historically, the first part of this assignment was meant to help you scope down
your design, so it is still recommended to complete it even though it is not
graded. You may want to share your ideas with your instructor before you start
coding. In any case, it is your job to budget your time effectively.

With that said, it may not be a good idea to start early. Much of the
discipline will not be exposed to you until the end of week 3. Perhaps a good
starting time would be after your first midterm when you'll know if you need
an exam replacement.

In addition, you will have to learn some of the concepts (e.g., the common
methods) on your own, even though the course will cover them near the end of
the course. So, once you understand how to layer a component (i.e., after week
3), you can begin your work. Do not wait until the end of the course to start.

Also, you may submit the entire component **early** for a chance to get
feedback. There will be an early submission window, about a week before the
second midterm, where you can submit your completed component for an initial
grade. Any submissions after this point will not have a chance to resubmit.

Finally, if you have no idea where to start, consider checking out the
[part 1 docs](01-component-brainstorming\01-component-brainstorming.md).
There, you'll find a link to an article that includes project ideas. It is
recommended to follow the instructions in parts 1 through 6 anyway (even the
proof of concept for your own sanity), but you can continue to ignore the
individual submission instructions since you'll just be submitting everything at
once.

## Artificial Intelligence (AI) Policy

The purpose of this assignment is to help you develop your own skill and style
as a future software developer. You cannot do that if you shortcut your growth
by leveraging the available generative AI tools that exist today (e.g., ChatGPT,
Claude, Gemini, Codex, Copilot, etc.). In fact, even if you plan to entirely
write code in the future by burning tokens, you still need to fundamentally
understand software to step in when things go wrong. Therefore, use of these
tools on this assignment are strictly prohibited.

With that said, it is impossible to prevent you from using "AI" to develop
your component. Copilot is currently embedded in VS Code, and even disabling AI
integration in VS Code using the `chat.disableAIFeatures` is not enough. First,
it's very easy for you to flip the boolean to false or to delete the line
altogether, despite this being an obvious sign of ignoring this disclaimer in
your pull request. Second, there are probably hundreds of chat bot extensions
that bypass this setting. Third, there is really nothing stopping you from
using a third-party tool and dumping the resulting code here. Ultimately,
there is just no way to prove that you used AI.

However, in the same way that educators have no control over the usage of AI,
beyond coding with pen and paper, you have no control over the assessment
process. Therefore, it is in your best interest to do your own work because
only you can trust the work that you produce. If you do not develop the
expertise to do good work, you won't be able to evaluate the output of a chat
bot or agent. You will be putting your grade in the hands of an LLM. Use it at
your own risk.

With that said, since the type of student who will use "AI" on their component
is unlikely to even read this section, a series of prompts are provided in the
AGENTS.md file at the root of the repo. While the most desperate will
certainly find workarounds, hopefully it gives everyone else a good laugh.
